package com.sahil.spring_boot_kickoff.model;

import jakarta.persistence.*;

@Entity
@Table(name = "messages")
public class HelloMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String message;

    public HelloMessage() {

    }
    public HelloMessage(String message) {
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
