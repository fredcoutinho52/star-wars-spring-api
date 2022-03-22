package com.fredcoutinho.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class StarWarsController {

    private String baseUrl = "https://swapi.dev/api/";

    @GetMapping("/people")
    public Object getPeople(@RequestParam(value = "id", defaultValue = "1") String id) {
        String url = baseUrl + "people/" + id + "/";
        RestTemplate restTemplate = new RestTemplate();
        Object result = restTemplate.getForObject(url, Object.class);
        return result;
    }

    @GetMapping("/films")
    public Object getFilm(@RequestParam(value = "id", defaultValue = "1") String id) {
        String url = baseUrl + "films/" + id + "/";
        RestTemplate restTemplate = new RestTemplate();
        Object result = restTemplate.getForObject(url, Object.class);
        return result;
    }

    @GetMapping("/vehicles")
    public Object getVehicles(@RequestParam(value = "id", defaultValue = "1") String id) {
        String url = baseUrl + "vehicles/" + id + "/";
        RestTemplate restTemplate = new RestTemplate();
        Object result = restTemplate.getForObject(url, Object.class);
        return result;
    }
}
