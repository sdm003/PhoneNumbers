package com.example.demo.service;

import com.example.demo.entity.City;
import com.example.demo.entity.Region;
import com.example.demo.repositories.CityRepository;
import com.example.demo.repositories.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    CityRepository cityRepository;
    @Autowired
    RegionRepository regionRepository;

    @Override
    public Long addCity(String cityName, Long regionId) {
        Region region=regionRepository.findById(regionId).get();
        City city=new City(cityName,region);
        cityRepository.save(city);
        return city.getId();
    }
}
