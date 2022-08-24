package com.jap;

import java.util.Arrays;

public class QuizDemo {

    //return the school name which has got the highest score in quiz
    //Handle the NumberFormatException
    public String highestScore(String []nameOfSchool , String[] scores )
    {
        int highestScoreIndex = 0;
        try {
            int max = Integer.parseInt(scores[0]);
            for (int i = 0; i < scores.length; i++) {
                if (Integer.parseInt(scores[i]) > max) {
                    max = Integer.parseInt(scores[i]);
                    highestScoreIndex = i;
                }
            }
        }catch (NumberFormatException e){
            return e.toString();
        }

        return nameOfSchool[highestScoreIndex];

    }
    //convert all the names in uppercase
    //Handle the NullPointerException
    public String[] convertAllNamesToCapital(String name[])
    {
        String upperCase[] = new String[name.length];
        try{
            for (int i = 0; i < upperCase.length; i++) {
                upperCase[i] = name[i].toUpperCase();
            }

        }catch(NullPointerException e){
            String[] nullpointer = new String[1];
            nullpointer[0] = e.toString();
            return nullpointer;
        }

        return upperCase;
    }

    public static void main(String[] args) {
        QuizDemo quizDemo = new QuizDemo();
        String[] nameOfSchools = {"DAV","RSK","Treamis","Candor","Oak","BCGS","BCBS","Baldwin","NPS"};
        String[] scores ={"86","78","95","6","44","33","82","77","8","90"};
        System.out.println(quizDemo.highestScore(nameOfSchools, scores));
        String[] nameOfSchool = {"DAV","RSK",null,"Candor","Oak","BCGS","BCBS","Baldwin","NPS"};
        System.out.println(Arrays.toString(quizDemo.convertAllNamesToCapital(nameOfSchools)));
        System.out.println(Arrays.toString(quizDemo.convertAllNamesToCapital(nameOfSchool)));
    }
}






