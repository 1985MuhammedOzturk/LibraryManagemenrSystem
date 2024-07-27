/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package database;


import org.junit.jupiter.api.Test;
import java.sql.Connection;
import java.sql.SQLException;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author moztu
 */
public class DBConnectionTest {

    @Test
    public void testSingletonInstance() {
        try {
            DBConnection instance1 = DBConnection.getInstance();
            DBConnection instance2 = DBConnection.getInstance();
            assertNotNull(instance1);
            assertNotNull(instance2);
            assertSame(instance1, instance2);
        } catch (SQLException e) {
            fail("SQLException thrown: " + e.getMessage());
        }
    }

    @Test
    public void testConnection() {
        try {
            DBConnection instance = DBConnection.getInstance();
            Connection connection = instance.getConnection();
            assertNotNull(connection);
        } catch (SQLException e) {
            fail("SQLException thrown: " + e.getMessage());
        }
    }
}