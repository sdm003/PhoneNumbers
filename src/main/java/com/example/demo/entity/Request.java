package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "request")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate date;

    @Column(name = "number", nullable = false)
    private Integer numberOfRequest;

    @Column(name = "name_of_organization", nullable = false)
    private String nameOfOrganization;

    @Column(name = "fio", nullable = false, unique = true)
    private String usersFullName;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "position",nullable = false, unique = false)
    private String position;

    public Request() {
    }

    public Request(LocalDate date, Integer numberOfRequest, String nameOfOrganization, String usersFullName, String email, String position) {
        this.date = date;
        this.numberOfRequest = numberOfRequest;
        this.nameOfOrganization = nameOfOrganization;
        this.usersFullName = usersFullName;
        this.email = email;
        this.position = position;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getNumberOfRequest() {
        return numberOfRequest;
    }

    public void setNumberOfRequest(Integer numberOfRequest) {
        this.numberOfRequest = numberOfRequest;
    }

    public String getNameOfOrganization() {
        return nameOfOrganization;
    }

    public void setNameOfOrganization(String nameOfOrganization) {
        this.nameOfOrganization = nameOfOrganization;
    }

    public String getUsersFullName() {
        return usersFullName;
    }

    public void setUsersFullName(String usersFullName) {
        this.usersFullName = usersFullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

