package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name="blinddates")
public class BlindDate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="student_number")
    private Students students;

    @ManyToOne
    @JoinColumn(name="lecturer_id")
    private Lecturer lecturer;

    private Boolean confirmed=false;

    public BlindDate(Students students, Lecturer lecturer) {
        this.students = students;
        this.lecturer = lecturer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public Boolean getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }
}

