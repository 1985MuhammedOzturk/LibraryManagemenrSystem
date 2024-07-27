/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package event;

import constants.Constants;
/**
 *
 * @author moztu
 */
public class BookLaunch implements Event {
    private int id;
    private String name;
    private EventType type;
    private double cost;
    private int duration;

    public BookLaunch() {
        this.name = "Book Launch";
        this.type = EventType.BOOK_LAUNCH;
        this.cost = Constants.BOOK_LAUNCH_RATE;
        this.duration = Constants.DEFAULT_DURATION;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public EventType getType() {
        return type;
    }

    @Override
    public double getCost() {
        return cost;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public double calculateAdmissionFee() {
        return cost * duration;
    }

    @Override
    public String toString() {
        return "Book Launch{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", cost=" + cost +
                ", duration=" + duration +
                '}';
    }
}