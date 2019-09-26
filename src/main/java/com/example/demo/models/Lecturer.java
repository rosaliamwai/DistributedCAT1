package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "lecturer")
public class Lecturer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="lname")
    private String name;

    public Lecturer(String name) {
        this.name = name;
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
}
