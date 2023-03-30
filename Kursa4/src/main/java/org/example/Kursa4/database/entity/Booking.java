package org.example.Kursa4.database.entity;

import javax.persistence.*;

@Entity
@Table(name="booking")
public class Booking {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long customer_id;
    private Long price;
    private Long order_number;
    private Long employee_id;

    public Booking(){
    }

    public Booking(Long customer_id, Long price, Long order_number, Long employee_id) {
        this.customer_id = customer_id;
        this.price = price;
        this.order_number = order_number;
        this.employee_id = employee_id;
    }

    public Long getOrder_number() {
        return order_number;
    }

    public void setOrder_number(Long order_number) {
        this.order_number = order_number;
    }

    public Long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
    }

    public Long getId() {
        return id;
    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
