package com.example.demo.service;

import com.example.demo.entity.Abonent;
import com.example.demo.model.AbonentModel;
import org.springframework.stereotype.Service;


public interface AbonentService {
    Long addAbonent(Abonent abonent,Long cityId);
    Long changeAbonent(AbonentModel abonent);
    AbonentModel getAbonent(Long id);
}
