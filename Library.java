/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

import event.Event;
import event.EventType;

/**
 *
 * @author moztu
 */
public interface Library {
    Event createEvent(EventType eventType);
}
