package org.example.Kursa4.database.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String surname;
    private String name;
    private LocalDateTime born_date;
    private Long salary;
    private String position;

    public Employee(){
    }

    public Employee(String surname, String name, LocalDateTime born_date, Long salary, String position) {
        this.surname = surname;
        this.name = name;
        this.born_date = born_date;
        this.salary = salary;
        this.position = position;
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

    public LocalDateTime getBorn_date() {
        return born_date;
    }

    public void setBorn_date(LocalDateTime born_date) {
        this.born_date = born_date;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Long getId() {
        return id;
    }
}
