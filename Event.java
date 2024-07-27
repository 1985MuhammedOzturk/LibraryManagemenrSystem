/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package event;

/**
 *
 * @author moztu
 */
public abstract class Event {
    private int id;
    private String name;
    private double cost;
    private double duration;

    public Event(String name, double cost, double duration) {
        this.name = name;
        this.cost = cost;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public double getDuration() {
        return duration;
    }

    public abstract String getDescription();

    public abstract String getActivities();

    public abstract double calculateAdmissionFee();
}