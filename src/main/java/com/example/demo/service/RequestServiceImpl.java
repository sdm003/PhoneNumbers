package com.example.demo.service;

import com.example.demo.entity.Request;
import com.example.demo.repositories.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestServiceImpl implements RequestService {
    @Autowired
    RequestRepository requestRepository;

@Override
    public Long addRequest(Request request)
    {

        requestRepository.save(request);
        return request.getId();

    }

    @Override
    public Long changeRequest(Integer requestId, Request request) {


    Request request1 = requestRepository.findById(requestId.longValue()).get();

    if(request1.getDate()!=null){

        request1.setDate(request1.getDate());

    }

    if(request1.getNameOfOrganization()!=null){

        request1.setNameOfOrganization(request.getNameOfOrganization());

    }

    if(request1.getNumberOfRequest()!=null){

        request1.setNumberOfRequest(request1.getNumberOfRequest());

    }

    if(request1.getUsersFullName()!=null){

        request1.setUsersFullName(request1.getUsersFullName());

    }
    if(request1.getPosition()!=null){

        request1.setPosition(request.getPosition());

    }

    if(request1.getEmail()!=null){

        request1.setEmail(request.getEmail());

    }

        requestRepository.save(request1);

        return request1.getId();
    }

    @Override
    public List<Request> getAllRequests() {

        List<Request> allRequests = requestRepository.findAll();

        return allRequests;
    }

    @Override
    public String deleteRequest(Integer id) {

        Request request = requestRepository.findById(id.longValue()).get();

        requestRepository.delete(request);

        return "Request has been deleted";
    }
}
