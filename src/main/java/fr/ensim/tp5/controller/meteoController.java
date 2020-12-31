package fr.ensim.tp5.controller;

import fr.ensim.tp5.model.geo.AdresseGeo;
import fr.ensim.tp5.model.meteo.OneCallWeather.OneCallWeather;
import fr.ensim.tp5.model.meteo.currentWeather.CurrentWeather;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@Controller
public class meteoController {

    @PostMapping("/meteo")
    public String showAddresses(
            @RequestParam(name = "adresse", required = false, defaultValue = "") String adresse,
            @RequestParam(name = "codepostal", required = false) String codepostal,
            @RequestParam(name = "ville", required = false) String ville,
            Model model) {
        model.addAttribute("adresse", adresse);
        model.addAttribute("codepostal", codepostal);
        model.addAttribute("ville", ville);

        RestTemplate restTemplateGeo = new RestTemplate();
        String GeoApiUrl = "https://api-adresse.data.gouv.fr/search/?q=" + adresse + " " + codepostal + " " + ville;
        AdresseGeo response = restTemplateGeo.getForObject(GeoApiUrl, AdresseGeo.class);

        float lon = response.getFeature(0).getGeometry().getCoordinates().get(0);
        float lat = response.getFeature(0).getGeometry().getCoordinates().get(1);

        model.addAttribute("GeoApiUrl", GeoApiUrl);
        model.addAttribute("lat", lat);
        model.addAttribute("lon", lon);


        RestTemplate restTemplateMeteo = new RestTemplate();
        String apiMeteoUrl = "https://api.openweathermap.org/data/2.5/weather?lat=" + lat + "&lon=" + lon + "&appid=75fc5ee8b7b1b66ca7a543164c52d70d";
        CurrentWeather currentWeather = restTemplateMeteo.getForObject(apiMeteoUrl, CurrentWeather.class);

        float temp = currentWeather.getMain().getTemp() - 273.15f;
        model.addAttribute("apiMeteoUrl", apiMeteoUrl);
        model.addAttribute("temp", temp);

        RestTemplate restTemplateMeteo2 = new RestTemplate();
        String apiMeteoUrl2 = "https://api.openweathermap.org/data/2.5/onecall?lat=" + lat + "&lon=" + lon + "&exclude=&appid=75fc5ee8b7b1b66ca7a543164c52d70d";
        OneCallWeather oneCallWeather = restTemplateMeteo2.getForObject(apiMeteoUrl2, OneCallWeather.class);

        String previsionLendemain = oneCallWeather.getDaily().get(1).getWeather().get(0).getDescription();

        model.addAttribute("apiMeteoUrl2", apiMeteoUrl2);
        model.addAttribute("previsionLendemain", previsionLendemain);
//        Timestamp ts = new Timestamp((long) 1609502400*1000);
        float dt = oneCallWeather.getDaily().get(1).getDt();
        Date datePrevision = new Date((long) dt*1000);
        model.addAttribute("datePrevision", datePrevision);

        return "meteo";
    }
}


//meteo?adresse=Test&codepostal=test&ville=test