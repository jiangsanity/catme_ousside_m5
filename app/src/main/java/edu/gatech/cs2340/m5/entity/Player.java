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
}
