package com.example.demo.controller;

import com.example.demo.entity.Request;
import com.example.demo.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

@RestController
@EnableWebMvc
@RequestMapping("requests")
public class RequestController {

@Autowired
RequestService requestService;

@PostMapping
public Long create(@RequestBody Request request){

    return requestService.addRequest(request);

}

@GetMapping
    public List<Request> getAll(){

    return requestService.getAllRequests();

}

@PutMapping("/{userId}")
    public Long changeRequest(@PathVariable Integer userId, @RequestBody Request request){

    return requestService.changeRequest(userId, request);

}

@DeleteMapping("/{userId}")
    public String deleteRequest(@PathVariable Integer userId){

    return requestService.deleteRequest(userId);

}

}
