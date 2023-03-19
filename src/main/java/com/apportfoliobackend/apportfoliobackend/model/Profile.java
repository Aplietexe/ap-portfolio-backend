package com.apportfoliobackend.apportfoliobackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String headerUrl;
    private String avatarUrl;
    private String name;
    private String title;

    @Column(columnDefinition = "TEXT")
    private String about;
}
