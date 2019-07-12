package com.example.demo.service;

import com.example.demo.entity.Abonent;
import com.example.demo.entity.City;
import com.example.demo.model.AbonentModel;
import com.example.demo.repositories.AbonentRepository;
import com.example.demo.repositories.CityRepository;
import com.example.demo.repositories.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AbonentServiceImpl implements AbonentService {
    @Autowired
    AbonentRepository abonentRepository;
    @Autowired
    CityRepository cityRepository;
@Autowired
RegionRepository regionRepository;
    @Override
    public Long addAbonent(Abonent abonent, Long cityId) {
        City city=cityRepository.findById(cityId).get();
        abonent.setCity(city);
        abonentRepository.save(abonent);
        return abonent.getId();
    }


    @Override
    public Long changeAbonent(AbonentModel abonent) {
        Abonent abonent1 = abonentRepository.findById(abonent.getId()).get();
        abonent1.setName(abonent.getName());
        abonent1.setCity(cityRepository.findById(abonent.getCityId()).get());
        abonent1.setPhoneNumber(abonent.getPhoneNumber());
        abonent1.setSurname(abonent.getSurname());
        abonentRepository.save(abonent1);
        return abonent1.getId();
    }

    @Override
    public AbonentModel getAbonent(Long id) {
        Abonent abonent=abonentRepository.findById(id).get();
        String cityName=abonent.getCity().getName();
        String regionName=abonent.getCity().getRegion().getName();
        AbonentModel abonentModel=new AbonentModel(abonent.getId(),abonent.getPhoneNumber(),abonent.getName(),abonent.getSurname(),cityName,regionName);


        return abonentModel;
    }
}
