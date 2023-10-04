package com.example.labrest_act2_aaaltive.models;

import jakarta.persistence.*;

@Entity
public class Answer {
    @Id
    private int id;
    private String answer = "";

    public Answer(int id, String answer) {
        this.id = id;
        this.answer = answer;
    }

    public Answer() {
    }

    public int getId() {
        return id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String name) {
        this.answer = name;
    }

}
