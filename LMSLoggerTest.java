/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package database;

import logger.LMSLogger;
import static org.junit.jupiter.api.Assertions.assertSame;
import org.junit.jupiter.api.Test;

/**
 *
 * @author moztu
 */
public class LMSLoggerTest {

    @Test
    public void testSingletonInstance() {
        LMSLogger logger1 = LMSLogger.getInstance();
        LMSLogger logger2 = LMSLogger.getInstance();
        assertSame(logger1, logger2, "There should only be one instance of LMSLogger");
    }
}