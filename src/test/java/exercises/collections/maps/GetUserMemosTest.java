package exercises.collections.maps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetUserMemosTest {

    @Test
    void getUserPostsFast() {
        /* vediamo il tempo usando il primo metodo */
        Long t0 = System.currentTimeMillis();
        System.out.println("running GetUserMemos.getUserPosts() (slow)");
        GetUserMemos.getUserPosts();
        Long t1 = System.currentTimeMillis();

        /* e poi lo confrontiamo con il tempo usando il secondo metodo */
        System.out.println("running GetUserMemos.getUserPostsFast() (fast)");
        GetUserMemos.getUserPostsFast();
        Long t2 = System.currentTimeMillis();

        System.out.println("First method took " + (t1 - t0) + " milliseconds");
        System.out.println("Second method took " + (t2 - t1) + " milliseconds");

        assertTrue((t2 - t1) < (t1 - t0));
    }
}