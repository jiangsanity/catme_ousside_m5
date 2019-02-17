package edu.gatech.cs2340.m5.entity;

public class Player {
    private String name;
    private int difficulty;
    private int pilotPoints;
    private int fighterPoints;
    private int traderPoints;
    private int engineerPoints;

    public Player(String name, int difficulty) {
        this.name = name;
        this.difficulty = difficulty;
    }

    public Player() {
        this("No Name", -1);
    }

    public String getName() {
        return name;
    }

    public int getUserID() {
        return difficulty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public void setPilotPoints(int pilotPoints) {
        this.pilotPoints = pilotPoints;
    }

    public void setFighterPoints(int fighterPoints) {
        this.fighterPoints = fighterPoints;
    }

    public void setTraderPoints(int traderPoints) {
        this.traderPoints = traderPoints;
    }

    public void setEngineerPoints(int engineerPoints) {
        this.engineerPoints = engineerPoints;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public int getPilotPoints() {
        return pilotPoints;
    }

    public int getFighterPoints() {
        return fighterPoints;
    }

    public int getTraderPoints() {
        return traderPoints;
    }

    public int getEngineerPoints() {
        return engineerPoints;
    }
}
