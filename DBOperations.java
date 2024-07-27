/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import event.Event;
import event.Workshop;
import logger.LMSLogger;
import logger.LogLevel;

import java.sql.*;
/**
 *
 * @author moztu
 */
public class DBOperations {
    private Connection connection;

    public DBOperations() {
        try {
            connection = DBConnection.getInstance().getConnection();
        } catch (SQLException e) {
            LMSLogger.getInstance().log(LogLevel.ERROR, "Error establishing database connection");
        }
    }

    public void createEvent(Event event) {
        String query = "INSERT INTO events (event_name, event_description, event_activities, admission_fees) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, event.getName());
            stmt.setString(2, "Description of " + event.getName());
            stmt.setString(3, "Activities of " + event.getName());
            stmt.setDouble(4, event.calculateAdmissionFee());
            stmt.executeUpdate();
            connection.commit();
            LMSLogger.getInstance().log(LogLevel.INFO, "Event created successfully: " + event.getName());
        } catch (SQLException e) {
            e.printStackTrace();
            LMSLogger.getInstance().log(LogLevel.ERROR, "Error creating event");
        }
    }

    public Event retrieveEvent(int id) {
        String query = "SELECT * FROM events WHERE event_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                // Add logic to return the appropriate Event type
                // You may need to identify the correct type from the result set
                // This is an example placeholder logic
                Event event = new Workshop(); // Replace with appropriate event creation logic
                event.setId(rs.getInt("event_id"));
                event.setName(rs.getString("event_name"));
                return event;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateEvent(Event event) {
        String query = "UPDATE events SET event_name = ?, event_description = ?, event_activities = ?, admission_fees = ? WHERE event_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, event.getName());
            stmt.setString(2, "Description of " + event.getName());
            stmt.setString(3, "Activities of " + event.getName());
            stmt.setDouble(4, event.calculateAdmissionFee());
            stmt.setInt(5, event.getId());
            stmt.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteEvent(int id) {
        String query = "DELETE FROM events WHERE event_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}