package com.example.quiz;

import java.util.Random;

public class Questions {

    private Random rng = new Random();

    public String mQuestions[] = {
            "What color is a firetruck?",
            "Which planet is the closest to the sun?",
            "Google or Bing?",
            "How many months are in a year?",
            "How many colors are in a rainbow?",
            "Baby lions are called ___",
            "What is the square root of 64?",
            "Who hunts most - male or female lions",
            "Who invented the light bulb?",
            "There are 30 days in November",
            "What is the most popular sport in the world?",
            "How many players are on a football field?",
            "How many planets are in our solar system?",
            "How many legs do spiders have?",
            "Squids have beaks",
            "Sea horses swim in an upright position",
            "What is a baby goat called?",
            "Which of these is a nocturnal animal?",
            "Which is larger?",
            "What is the fastest animal?",
    };

    private String mChoices[][] = {
        {"Red", "Blue", "Green", "Yellow"},
        {"Earth", "Mars", "Neptune", "Mercury"},
        {"Google"},
        {"13", "11", "12", "6"},
        {"7", "9", "4", "11"},
        {"Kittens", "Cubs", "Babies", "Puppies"},
        {"9", "15", "8", "12"},
        {"Female"},
        {"Thomas Edison", "Alexander Graham Bell", "Leonardo da Vinci", "James Watt"},
        {"True", "False"},
        {"Tennis", "F1 Racing", "American Football", "Soccer"},
        {"11", "22", "23", "36"},
        {"9", "8", "7", "11"},
        {"12", "4", "6", "8"},
        {"6", "12", "8", "10"},
        {"False", "True"},
        {"False", "True"},
        {"Child", "Cub", "Lamb", "Kid"},
        {"Owl", "Dog", "Gorilla", "Hawk"},
        {"Bus", "Laptop", "Person", "Van"},
        {"Three Toed Sloth", "Lion", "Cheetah", "Peregrine Falcon"},
    };

    private String mCorrectAnswers[] = {
            "Red",
            "Mercury",
            "Google",
            "12",
            "7",
            "Cubs",
            "8",
            "Female",
            "Thomas Edison",
            "True",
            "Soccer",
            "22",
            "8",
            "8",
            "True",
            "True",
            "Kid",
            "Owl",
            "Bus",
            "Peregrine Falcon"
    };

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;

    }public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;

    }public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }
    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return  answer;
    }


}
