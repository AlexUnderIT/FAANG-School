package org.example.Kursa4.database.entity;

import javax.persistence.*;

@Entity
@Table(name="customer")
public class Customer {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String surname;
    private String name;
    private String phone;
    private String email;
    private String car;
    private String registration_number;

    public Customer(){

    }

    public Customer(String surname, String name, String phone, String email, String car, String registration_number) {
        this.surname = surname;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.car = car;
        this.registration_number = registration_number;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getRegistration_number() {
        return registration_number;
    }

    public void setRegistration_number(String registration_number) {
        this.registration_number = registration_number;
    }

    public Long getId() {
        return id;
    }
}
