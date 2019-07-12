package com.example.demo.controller;

import com.example.demo.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("region")
public class RegionController {
@Autowired
RegionService regionService;
@PostMapping
    public Long createRegion(@RequestBody String regionName){
    return regionService.addRegion(regionName);
}
}
