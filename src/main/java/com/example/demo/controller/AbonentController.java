package com.example.demo.controller;

import com.example.demo.entity.Abonent;
import com.example.demo.model.AbonentModel;
import com.example.demo.service.AbonentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("abonent")
public class AbonentController {
@Autowired
    AbonentService abonentService;

@PostMapping
public Long create(@RequestBody Abonent abonent,@RequestBody Long cityId){
    return
    abonentService.addAbonent(abonent,cityId);
}
@GetMapping
    public AbonentModel get(@RequestBody Long abonentId){
   return abonentService.getAbonent(abonentId);
}
@PutMapping
    public Long changeAbonent(@RequestBody AbonentModel abonentModel){

    return abonentService.changeAbonent(abonentModel);
}
}
