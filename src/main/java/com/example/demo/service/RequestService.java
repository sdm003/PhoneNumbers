package com.example.demo.service;

import com.example.demo.entity.Request;

import java.util.List;


public interface RequestService {
    Long addRequest(Request request);
    Long changeRequest(Integer requestId, Request request);
    List<Request> getAllRequests();
    String deleteRequest(Integer id);
}
