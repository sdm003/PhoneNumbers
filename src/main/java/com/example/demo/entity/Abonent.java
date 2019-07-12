package com.example.demo.entity;

import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;

@Entity
@Table(name = "abonent")
public class Abonent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "surname", nullable = false)
    private String surname;
    // Для того чтобы привести номер телефона в нужный формат я использовал NUmberFormat
    @Column(name = "phone", nullable = false, unique = true)
    @NumberFormat(style = NumberFormat.Style.NUMBER, pattern = "(\\+996|)[0-9]")
    private Long phoneNumber;
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    public Abonent(String name, String surname, Long phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;

    }

    public Abonent() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
