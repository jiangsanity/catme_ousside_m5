package edu.gatech.cs2340.m5.entity;

public class Player {
    private String name;
    private int difficulty;
    private int pilotPoints;
    private int fighterPoints;
    private int traderPoints;
    private int engineerPoints;
    private String ship;

    /**
     * Constructs a new player
     * @param name the name of the player
     * @param difficulty the difficulty of the game
     * @param pilotPoints number of points for pilot skill
     * @param fighterPoints number of points for fighter skill
     * @param traderPoints number of points for trader skill
     * @param engineerPoints number of points for engineering skill
     * @param ship the type of ship the player owns
     */
    public Player(String name, int difficulty, int pilotPoints, int fighterPoints, int traderPoints,
                  int engineerPoints, String ship) {
        this.name = name;
        this.difficulty = difficulty;
        this.pilotPoints = pilotPoints;
        this.fighterPoints = fighterPoints;
        this.traderPoints = traderPoints;
        this.engineerPoints = engineerPoints;
        this.ship = ship;
    }

    public Player() {
        this("No Name", -1, -1, -1, -1,
                -1, "Gnat");
    }

    /**
     *
     * @return the name of the player
     */

    public String getName() {
        return name;
    }

    /**
     *
     * @return the chosen difficulty of the game
     */

    public int getDifficulty() {
        return difficulty;
    }

    /**
     *
     * @return the number of points for pilot skill
     */

    public int getPilotPoints() {
        return pilotPoints;
    }

    /**
     *
     * @return the number of points for fighter skill
     */

    public int getFighterPoints() {
        return fighterPoints;
    }

    /**
     *
     * @return the number of points for trader skill
     */

    public int getTraderPoints() {
        return traderPoints;
    }

    /**
     *
     * @return the number of points for engineering skill
     */

    public int getEngineerPoints() {
        return engineerPoints;
    }

    /**
     *
     * @return an array of the points for each skill
     */

    public int[] getAllPoints() {
        return  new int[]{ pilotPoints, fighterPoints, traderPoints, engineerPoints};
    }

    /**
     *
     * @return the type of ship the player owns
     */

    public String getShip() {
        return ship;
    }

    /**
     *
     * @param name the player's name
     */


    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param difficulty the game's difficulty
     */

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    /**
     *
     * @param pilotPoints points dedicated to pilot skill
     */

    public void setPilotPoints(int pilotPoints) {
        this.pilotPoints = pilotPoints;
    }

    /**
     *
     * @param fighterPoints points dedicated to fighter skill
     */

    public void setFighterPoints(int fighterPoints) {
        this.fighterPoints = fighterPoints;
    }

    /**
     *
     * @param traderPoints points dedicated to trader skill
     */

    public void setTraderPoints(int traderPoints) {
        this.traderPoints = traderPoints;
    }

    /**
     * points dedicated to engineering skill
     * @param engineerPoints
     */

    public void setEngineerPoints(int engineerPoints) {
        this.engineerPoints = engineerPoints;
    }

    /**
     *
     * @param ship type of ship the player owns
     */

    public void setShip(String ship) {
        this.ship = ship;
    }

}
