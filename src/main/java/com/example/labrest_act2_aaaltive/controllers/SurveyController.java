package com.example.labrest_act2_aaaltive.controllers;

import com.example.labrest_act2_aaaltive.models.Answer;
import com.example.labrest_act2_aaaltive.models.Survey;
import com.example.labrest_act2_aaaltive.models.SurveyItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Controller for the survey
 */
@RequestMapping("/surveys")
@RestController
public class SurveyController {

    private List<Survey> dummySurveyColl = new ArrayList<>();
    public SurveyController() {
        for (int i = 0; i < 2; i++) {
            Survey dummySurvey = new Survey();
            dummySurvey.setName(String.format("Dummy Survey %d", i + 1));
            dummySurvey.setId(i);
            ArrayList<Answer> answers = new ArrayList<Answer>();
            answers.addAll(Arrays.asList(
                    new Answer(1, "Wrong Answer 1"),
                    new Answer(2, "Wrong Answer 2"),
                    new Answer(3, "Wrong Answer 3")
            ));
            String correctAnswer = "Correct Answer";
            String questionStem = "Question Stem";
            dummySurvey.addSurveyItem(new SurveyItem(1, questionStem, answers, correctAnswer));
        }

    }

    /**
     * Returns the collection of surveys
     * @return Survey
     */
    @GetMapping
    public List<Survey> getSurvey() {
        return dummySurveyColl;
    }

    /**
     * Returns the survey with the given id
     * @param id
     * @return Survey
     */
    @GetMapping("/surveyId")
    public Survey getSurveyById(int id) {
        for (Survey survey : dummySurveyColl) {
            if (survey.getId() == id) {
                return survey;
            }
        }
        return null;
    }

}
