package com.example.divya.libroslegis;

public class QuestionBank {
    // array of questions
    private String textQuestions[] = {
            "1.Any workplace with more than how many employees should have and an internal complaints committee constituted  as per Sexual Harassment of Women in Workplace Act, 2013?\n",
            "2. Sexual Harassment of Women in Workplace Act, 2013 defines sexual harassment as :\n",
            "3. In order to be eligible for maternity benefit under the Maternity Benefit Act, 1961, a woman worker should have worked for not less than________ days in the 12 months immediately preceding the date of delivery.",
            "4. In case of miscarriage, a woman worker shall be allowed leave with wages for how many weeks? \n",
            "5. Certain benefits are provided to employees in case of sickness, maternity and employment injury and provisions for certain other matters are detailed in?"
    };

    // array of multiple choices for each question
    private String multipleChoice[][] = {
            {"10", "100", "50", "60"},
            {"Making sexually colored remarks or showing Pornography", "A demand or request for sexual favours", "Both", "NONE"},
            {"80", "150", "30", "60"},
            {"12", "6", "4", "8"},
            {"The Factories Act", "The Employees State Insurance Act", "Maternity Benefit Act", "Sexual Harassment Act"}
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {"10", "Both", "80", "6", "The Employees State Insurance Act "};

    // method returns number of questions
    public int getLength() {
        return textQuestions.length;
    }

    // method returns question from array textQuestions[] based on array index
    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    // method return a single multiple choice item for question based on array index,
    // based on number of multiple choice item in the list - 1, 2, 3 or 4 as an argument
    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num - 1];
        return choice0;
    }

    //  method returns correct answer for the question based on array index
    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}