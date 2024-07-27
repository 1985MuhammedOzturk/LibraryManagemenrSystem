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
public class EventFactory {
    public Event createEvent(EventType eventType) {
        switch (eventType) {
            case WORKSHOP:
                return new Workshop("Workshop", eventType, Constants.WORKSHOP_RATE, Constants.DEFAULT_DURATION);
            case MOVIE_NIGHT:
                return new MovieNight("Movie Night", eventType, Constants.MOVIE_NIGHT_RATE, Constants.DEFAULT_DURATION);
            case KIDS_STORY_TIME:
                return new KidsStoryTime("Kids Story Time", eventType, Constants.KIDS_STORY_TIME_RATE, Constants.DEFAULT_DURATION);
            case BOOK_LAUNCH:
                return new BookLaunch("Book Launch", eventType, Constants.BOOK_LAUNCH_RATE, Constants.DEFAULT_DURATION);
            default:
                throw new IllegalArgumentException("Unknown event type: " + eventType);
        }
    }
}