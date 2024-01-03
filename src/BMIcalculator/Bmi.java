/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMIcalculator;

/**
 *
 * @author kasmira
 */
public class Bmi {
    int id, height, weight, yob; // yob = year of birth
    String name;

    // constructor
    public Bmi(int id, int height, int weight, int yob, String name) {
        this.id = id;
        this.height = height;
        this.weight = weight;
        this.yob = yob;
        this.name = name;
        calculate();
    }

    // setters & getters

    private void setId(int id) {
        this.id = id;
    }

    private int getId() {
        return this.id;
    }

    private void setHeight(int height) {
        this.height = height;
    }

    private int getHeight() {
        return this.height;
    }

    private void setWeight(int weight) {
        this.weight = weight;
    }

    private int getWeight() {
        return this.weight;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getName() {
        return this.name;
    }

    private void setYob(int yob) {
        this.yob = yob;
    }

    private int getYob() {
        return this.yob;
    }

    // calculate
    public double calculate() {
        return (this.weight / Math.pow(this.height, 2));
    }

    // display
    public void display() {
        System.out.println("---------------------------");
        System.out.println("ID: " + this.id + ", Name: " + this.name + ", BMI : "+calculate());
    }
}