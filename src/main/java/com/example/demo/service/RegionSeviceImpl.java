package com.example.demo.service;

import com.example.demo.entity.Region;
import com.example.demo.repositories.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegionSeviceImpl implements RegionService {

@Autowired
    RegionRepository regionRepository;

    @Override
    public Long addRegion(String name) {
        Region region =new Region(name);
       regionRepository.save(region);
       return region.getId();
    }
}
