package com.jpmchase.trustprofile.model;

import javax.persistence.*;

@Entity
@Table(name = "TEST")
public class Test {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "NAME")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
