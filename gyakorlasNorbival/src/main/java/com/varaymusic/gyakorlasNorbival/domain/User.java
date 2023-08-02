package com.varaymusic.gyakorlasNorbival.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
    @Column(name = "userName")
    private String userName;
    @Column(name = "password")
    private String password;
    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = Hobby.class, fetch = FetchType.EAGER)
    @CollectionTable(name="hobbies")
    @Column(name = "hobbies")
    private List<Hobby> hobbies = new ArrayList<>();
}
