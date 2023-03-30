package org.example.Kursa4.database.entity;

import javax.persistence.*;

@Entity
@Table(name="product")
public class Product {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String charact;
    private Long category_id;
    private String description;
    private String future_price;
    private String tag;


    public Product(){
    }

    public Product(String name, String charact, Long category_id, String description, String future_price, String tag) {
        this.name = name;
        this.charact = charact;
        this.category_id = category_id;
        this.description = description;
        this.future_price = future_price;
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    public String getCharact() {
        return charact;
    }

    public void setCharact(String charact) {
        this.charact = charact;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFuture_price() {
        return future_price;
    }

    public void setFuture_price(String future_price) {
        this.future_price = future_price;
    }

    public Long getId() {
        return id;
    }
}
