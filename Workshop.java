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
public class Workshop extends Event {
    public Workshop(String name, String description, String activities) {
        super(name, Constants.WORKSHOP_RATE, Constants.WORKSHOP_DURATION);
    }

    @Override
    public String getDescription() {
        return "Workshop Description";
    }

    @Override
    public String getActivities() {
        return "Workshop Activities";
    }

    @Override
    public double calculateAdmissionFee() {
        return getCost() * getDuration();
    }
}