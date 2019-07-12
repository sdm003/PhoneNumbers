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
// ID Города указывается отдельно для удобаства, чтобы не заполнять поле город полностью
@Override
    public Long addAbonent(Abonent abonent, Long cityId)
    {
        City city=cityRepository.findById(cityId).get();
        abonent.setCity(city);
        abonentRepository.save(abonent);
        return abonent.getId();
    }

// Я создал модель для удбного изменения данных в абоненте. Изменятся будут только те поля, которые были заданы в параметрах, остальные поля остануться прежними.
    @Override
    public Long changeAbonent(AbonentModel abonent) {

        Abonent abonent1 = abonentRepository.findById(abonent.getId()).get();
    if(abonent.getName()!=null){
        abonent1.setName(abonent.getName());}
    if(abonent.getCityId()!=null){
        abonent1.setCity(cityRepository.findById(abonent.getCityId()).get());}
    if(abonent.getPhoneNumber()!=null){
        abonent1.setPhoneNumber(abonent.getPhoneNumber());}
    if(abonent.getSurname()!=null){
        abonent1.setSurname(abonent.getSurname());}
        abonentRepository.save(abonent1);
        return abonent1.getId();
    }
//Для отображения только тех данных, которые мне нужны я использую модель абонента.
    @Override
    public AbonentModel getAbonent(Long id) {
        Abonent abonent=abonentRepository.findById(id).get();
        String cityName=abonent.getCity().getName();
        String regionName=abonent.getCity().getRegion().getName();
        AbonentModel abonentModel=new AbonentModel(abonent.getId(),abonent.getPhoneNumber(),abonent.getName(),abonent.getSurname(),cityName,regionName);


        return abonentModel;
    }
}
