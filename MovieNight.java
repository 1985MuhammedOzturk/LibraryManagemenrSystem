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
public class MovieNight extends Event {
    public MovieNight(String name, String description, String activities) {
        super(name, Constants.MOVIE_NIGHT_RATE, Constants.MOVIE_NIGHT_DURATION);
    }

    @Override
    public String getDescription() {
        return "Movie Night Description";
    }

    @Override
    public String getActivities() {
        return "Movie Night Activities";
    }

    @Override
    public double calculateAdmissionFee() {
        return getCost() * getDuration();
    }
}