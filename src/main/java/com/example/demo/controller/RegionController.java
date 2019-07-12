package com.example.demo.controller;

import com.example.demo.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("region")
public class RegionController {
@Autowired
RegionService regionService;
@PostMapping
    public Long createRegion(@RequestHeader String regionName){
    return regionService.addRegion(regionName);
}
}
