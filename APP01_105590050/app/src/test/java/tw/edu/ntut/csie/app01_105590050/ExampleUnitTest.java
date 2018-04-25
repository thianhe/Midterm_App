package tw.edu.ntut.csie.app01_105590050;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    changeGrade grade = new changeGrade();
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals("grade = 'A'", grade.letterGrade(90));
        assertEquals("grade = 'B'", grade.letterGrade(80));
        assertEquals("grade = 'C'", grade.letterGrade(70));
        assertEquals("grade = 'D'", grade.letterGrade(60));
        assertEquals("grade = 'F'", grade.letterGrade(59));
        assertEquals("grade = 'X'", grade.letterGrade(-1));
        assertEquals("grade = 'X'", grade.letterGrade(101));
    }
}