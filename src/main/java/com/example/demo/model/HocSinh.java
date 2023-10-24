package com.example.demo.model;

import javax.persistence.*;

@Entity
public class HocSinh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int score;

    @ManyToOne
    private Lop lop;
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public HocSinh() {
    }

    public HocSinh(Long id, String name, int score, Lop lop) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.lop = lop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }
}
