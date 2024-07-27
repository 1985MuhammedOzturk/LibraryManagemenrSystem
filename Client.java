/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;


import database.DBOperations;
import event.BookLaunch;
import event.Event;
import event.EventFactory;
import event.EventType;
import event.KidsStoryTime;
import event.MovieNight;
import event.Workshop;
import logger.LMSLogger;
import java.sql.SQLException;
import java.util.logging.Level;
import logger.LogLevel;


/**
 *
 * @author moztu
 */
public class Client {
    public static void main(String[] args) {
        EventFactory factory = new EventFactory();
        
        Event workshop = factory.createEvent(EventType.WORKSHOP);
        Event movieNight = factory.createEvent(EventType.MOVIE_NIGHT);
        Event kidsStoryTime = factory.createEvent(EventType.KIDS_STORY_TIME);
        Event bookLaunch = factory.createEvent(EventType.BOOK_LAUNCH);
        
        DBOperations dbOps = new DBOperations();
        dbOps.createEvent(workshop);
        dbOps.createEvent(movieNight);
        dbOps.createEvent(kidsStoryTime);
        dbOps.createEvent(bookLaunch);

        System.out.println(workshop);
        System.out.println("Admission Fee: " + workshop.calculateAdmissionFee());
        System.out.println(movieNight);
        System.out.println("Admission Fee: " + movieNight.calculateAdmissionFee());
        System.out.println(kidsStoryTime);
        System.out.println("Admission Fee: " + kidsStoryTime.calculateAdmissionFee());
        System.out.println(bookLaunch);
        System.out.println("Admission Fee: " + bookLaunch.calculateAdmissionFee());
    }
}