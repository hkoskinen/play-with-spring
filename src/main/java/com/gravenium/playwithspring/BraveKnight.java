package com.gravenium.playwithspring;

public class BraveKnight implements Knight {

    private Quest quest;
    private TrainingService trainingService;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        this.quest.embark();
    }

    public void setTrainingService(TrainingService trainingService) {
        this.trainingService = trainingService;
    }

    public void doDailyTraining() {
        System.out.println(trainingService.getTraining());
    }

}
