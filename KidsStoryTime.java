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
public class KidsStoryTime extends Event {
    public KidsStoryTime(String name, String description, String activities) {
        super(name, Constants.KIDS_STORYTIME_RATE, Constants.KIDS_STORYTIME_DURATION);
    }

    @Override
    public String getDescription() {
        return "Kids Story Time Description";
    }

    @Override
    public String getActivities() {
        return "Kids Story Time Activities";
    }

    @Override
    public double calculateAdmissionFee() {
        return getCost() * getDuration();
    }
}