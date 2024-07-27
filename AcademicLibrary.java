/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

import event.BookLaunch;
import event.Event;
import event.EventType;
import event.Workshop;
/**
 *
 * @author moztu
 */
public class AcademicLibrary {
    private Event workshop;
    private Event bookLaunch;

    public AcademicLibrary() {
        workshop = new Workshop("Workshop", "Workshop on AI", "AI activities");
        bookLaunch = new BookLaunch("Book Launch", "New Book Launch", "Book activities");
    }

    public Event getWorkshop() {
        return workshop;
    }

    public Event getBookLaunch() {
        return bookLaunch;
    }
}