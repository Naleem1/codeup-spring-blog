package com.codeup.codeupspringblog.models;

import jakarta.persistence.*;

@Entity
@Table(name="ads")
public class Ad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(nullable= false, length = 100)
    public String title;
    @Column(nullable = false)
    public String description;

    public Ad(){

    }
    public Ad(Long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }
}
