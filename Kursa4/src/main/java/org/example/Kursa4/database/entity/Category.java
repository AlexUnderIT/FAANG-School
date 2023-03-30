package org.example.Kursa4.database.entity;

import javax.persistence.*;

@Entity
@Table(name="category")
public class Category {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String part;
    private String description;
    private String html;

    public Category(){
    }

    public Category(String name, String part, String description, String html) {
        this.name = name;
        this.part = part;
        this.description = description;
        this.html = html;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getName() {
        return name;
    }

    public Category setName(String name) {
        this.name = name;
        return this;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String getDescription() {
        return description;
    }

    public Category setDescription(String description) {
        this.description = description;
        return this;
    }

    public Long getId() {
        return id;
    }

}
