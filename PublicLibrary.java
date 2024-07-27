/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

import event.Event;
import event.EventType;
import event.KidsStoryTime;
import event.MovieNight;
/**
 *
 * @author moztu
 */
public class PublicLibrary {
    private Event movieNight;
    private Event kidsStoryTime;

    public PublicLibrary() {
        movieNight = new MovieNight("Movie Night", "Movie Screening", "Movie activities");
        kidsStoryTime = new KidsStoryTime("Kids Story Time", "Storytelling for kids", "Story activities");
    }

    public Event getMovieNight() {
        return movieNight;
    }

    public Event getKidsStoryTime() {
        return kidsStoryTime;
    }
}