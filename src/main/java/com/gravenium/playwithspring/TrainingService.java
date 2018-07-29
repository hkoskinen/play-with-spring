package com.gravenium.playwithspring;

public class TrainingService {

    private String[] training = { "Practice swordplay", "Do 30 minutes archery",
            "Do knightly stuff", "Make sure that your horse is ready to go" };

    public String getTraining() {
        return training[(int)(Math.floor(Math.random() * training.length))];
    }

}
