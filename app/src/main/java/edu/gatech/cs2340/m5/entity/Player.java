package edu.gatech.cs2340.m5.entity;

public class Player {
    private String name;
    private int userID;

    public Player(String name, int userID) {
        this.name = name;
        this.userID = userID;
    }

    public Player() {
        name = "No Name";
        userID = -1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public int getUserID() {
        return userID;
    }
}
