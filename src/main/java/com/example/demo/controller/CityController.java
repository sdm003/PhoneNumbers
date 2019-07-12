package com.example.demo.controller;

import com.example.demo.entity.City;
import com.example.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("city")
public class CityController {
    @Autowired
    CityService cityService;

    @PostMapping
    @RequestMapping("/create")
    public Long create(@RequestBody String cityName, @RequestBody Long regionId){
        return cityService.addCity(cityName,regionId);
    }
}
