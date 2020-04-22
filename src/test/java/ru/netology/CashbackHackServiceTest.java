package ru.netology;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
  @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
       int amount = 900;
       int actual = 100;
       int expected = service.remain (amount);

       assertEquals (expected, actual);
    }
    @Test
    public void testRemain1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = 0;
        int expected = service.remain (amount);

        assertEquals (expected, actual);
    }

}