package com.example.demo.model;

public class AbonentModel {
    private Long id;
    private Long phoneNumber;
    private String name;
    private String surname;
    private String cityName;
    private String regionName;
    private Long cityId;

    public AbonentModel(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public AbonentModel(Long id,Long phoneNumber, String name, String surname,Long cityId) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.surname = surname;
        this.cityId=cityId;
        this.id=id;

    }

    public AbonentModel(Long id, Long phoneNumber, String name, String surname, String cityName, String regionName) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.surname = surname;
        this.cityName = cityName;
        this.regionName = regionName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }
}
