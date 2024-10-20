package dev.omedia.sections.section_11.exercise_48;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return this.hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return this.weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }


    public List<String> write() {

        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + hitPoints);
        values.add(2, "" + strength);
        values.add(3, this.weapon);
        return values;
    }

    public void read(List<String> savedValues) {
        if (savedValues == null || savedValues.isEmpty()) {
            return;
        }
        this.name = savedValues.get(0);
        this.hitPoints = Integer.parseInt(savedValues.get(1));
        this.strength = Integer.parseInt(savedValues.get(2));
        this.weapon = savedValues.get(3);
    }

    public String toString() {
        return "Player{" + "name='" + this.name + '\'' + ", hitPoints=" + this.hitPoints + ", strength=" + this.strength + ", weapon='" + this.weapon + '\'' + '}';
    }
}
