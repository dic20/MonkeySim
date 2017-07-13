import org.junit.*;
import static org.junit.Assert.*;

public class PinningTests {
    /**
    * Testing that the generateID always returns the correct value for a given n. This test 
    * is asserting that when generateID is called on value 1 twice, it returns the same result twice
    */
    @Test
    public void generateIDAlwaysEqualTestGreaterThanZero() {
        Monkey m = new Monkey();
        int x = m.generateId(1);
        int y = m.generateId(1);
        assertEquals(x, y);
    }

    /**
    * Testing that the generateID always returns the correct value for a given n. This test 
    * is asserting that when generateID is called on value 0 twice, it returns the same result twice
    */
    @Test
    public void generateIDAlwaysEqualTestZero() {
        Monkey m = new Monkey();
        int x = m.generateId(0);
        int y = m.generateId(0);
        assertEquals(x, y);
    }

    /**
    *  Testing that the string format of the round prints out correctly when a valid monkey is entered
    */
    @Test
    public void StringifyValidMonkeyTest() {
        try {
            Monkey m = new Monkey();
            Monkey m2 = new Monkey();
            String test = MonkeySim.stringifyResults(2, m, m2);
            assertEquals(test, "//Round 2: Threw banana from Monkey (#" + m.getMonkeyNum() + " / ID " + m.getId() + ") to Monkey (#" + m2.getMonkeyNum() + " / ID " + m2.getId() + ")");
        } catch (NoIdException e) {
            fail();
        }
    }

    /**
    *  Testing that the stringify of the same monkey passed twice prints out correctly
    */
    @Test
    public void StringifyMonkeyTestSameMonkeyPassedTwiceTest() {
       try {
            Monkey m = new Monkey();
            String test = MonkeySim.stringifyResults(2, m, m);
            assertEquals(test, "//Round 2: Threw banana from Monkey (#" + m.getMonkeyNum() + " / ID " + m.getId() + ") to Monkey (#" + m.getMonkeyNum() + " / ID " + m.getId() + ")");
        } catch (NoIdException e) {
            fail();
        }
    }
}