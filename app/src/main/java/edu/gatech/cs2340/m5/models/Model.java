package edu.gatech.cs2340.m5.models;

import edu.gatech.cs2340.m5.entity.Player;

public class Model {

    private Player p;

    private static Model instance = new Model();

    private Model() {
        p = new Player();
    }
}
