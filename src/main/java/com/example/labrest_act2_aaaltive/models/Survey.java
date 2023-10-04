package com.example.labrest_act2_aaaltive.models;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Survey {
    @Id
    private int id;
    private String name = "";

    @OneToMany
    private List<SurveyItem> sureveyItems = new ArrayList<SurveyItem>();

    public Survey(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Survey() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public List<SurveyItem> getSureveyItems() {
        return sureveyItems;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSurveyItem(SurveyItem surveyItem) {
        sureveyItems.add(surveyItem);
    }
}
