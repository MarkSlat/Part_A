/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package part_a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appTestForUsernames() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getStudentUsername(classUnderTest.getMark()));
        assertNotNull(classUnderTest.getLectureUsername(classUnderTest.getSchukat()));
        // assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
