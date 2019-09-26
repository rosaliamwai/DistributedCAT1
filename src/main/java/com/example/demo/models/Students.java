package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name="students")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="student_number")
    private String studentNumber;

    @Column(name="first_name")
    private String firstName;

    @Column(name="score")
    private int score=0;

    public Students(String studentNumber, String firstName) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

