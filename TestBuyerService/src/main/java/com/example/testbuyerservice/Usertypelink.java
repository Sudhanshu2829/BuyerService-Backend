package com.example.testbuyerservice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usertypelink")
public class Usertypelink {
    @Id
    @Column(name = "id", nullable = false, length = 50)
    private String id;

    @Column(name = "username", length = 50)
    private String username;

    @Column(name = "type", length = 50)
    private String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}