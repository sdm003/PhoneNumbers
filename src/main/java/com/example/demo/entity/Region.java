package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "Region")
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @Column(name = "region_name",nullable = false,unique = true)
    private String name;

    public Region(String name) {
        this.name = name;
    }

    public Region() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
