package exercises.collections.lists;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class SpeedTestTest {
    final int times = 10000;

    @Test
    void insertBeginning() {
        long arrayListTime = SpeedTest.insertBeginning(new ArrayList<>(), "ciao", times);
        long linkedListTime = SpeedTest.insertBeginning(new LinkedList<>(), "ciao", times);
        //System.out.println("array: " + arrayListTime + ", linked: " + linkedListTime);
        assertTrue(linkedListTime < arrayListTime);
    }

    @Test
    void insertEnd() {
        long arrayListTime = SpeedTest.insertEnd(new ArrayList<>(), "ciao", times);
        long linkedListTime = SpeedTest.insertEnd(new LinkedList<>(), "ciao", times);
        //System.out.println("array: " + arrayListTime + ", linked: " + linkedListTime);
        assertTrue(arrayListTime < linkedListTime);
    }
}