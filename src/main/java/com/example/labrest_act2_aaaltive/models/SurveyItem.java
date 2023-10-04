package com.example.labrest_act2_aaaltive.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class SurveyItem {
    @Id
    private int id;
    private String questionStem = "";
    @OneToMany
    private List<Answer> possAnsList = new ArrayList<Answer>();

    private String correctAns = "";

    public SurveyItem(int id, String questionStem, ArrayList<Answer> possAnsList, String corrAns) {
        this.id = id;
        this.questionStem = questionStem;
        this.possAnsList = possAnsList;
        this.correctAns = corrAns;
    }

    public SurveyItem() {
    }

    public int getId() {
        return id;
    }

    public String getQuestionStem() {
        return questionStem;
    }

    public List<Answer> getPossAnsList() {
        return possAnsList;
    }

    public String getCorrectAns() {
        return correctAns;
    }

    public void setQuestionStem(String questionStem) {
        this.questionStem = questionStem;
    }

    public void setPossAnsList(ArrayList<Answer> possAnsList) {
        this.possAnsList = possAnsList;
    }

    public void appendPossAnsList(Answer possAns) {
        this.possAnsList.add(possAns);
    }

    public void setCorrectAns(String correctAns) {
        this.correctAns = correctAns;
    }

}
