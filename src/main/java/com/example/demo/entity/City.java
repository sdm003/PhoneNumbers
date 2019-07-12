package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "City")
public class City {
    //Я подумал что будет лучше если я свяжу две таблицы Области и Города, чтобы при создани Абонента указывать только ID города.
    //Поэтому таблица город будет содержать ID региона, так как каждый город находится внутри какого-то региона.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "city_name",nullable = false,unique = true)
    private String name;
    @ManyToOne
    @JoinColumn(name="region_id")
    private Region region;

    public City() {
    }

    public City(String name, Region region) {
        this.name = name;
        this.region = region;
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

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
