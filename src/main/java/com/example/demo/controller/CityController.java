package com.example.demo.controller;

import com.example.demo.entity.City;
import com.example.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("city")
public class CityController {
    @Autowired
    CityService cityService;

    @PostMapping
    @RequestMapping("/create")
    public Long create(@RequestHeader String cityName, @RequestHeader Long regionId){
        return cityService.addCity(cityName,regionId);
    }
}
