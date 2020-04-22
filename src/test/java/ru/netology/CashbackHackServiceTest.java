package ru.netology;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {
   @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
       int amount = 900;
       int actual = 100;
       int expected = service.remain (amount);

       assertEquals (actual, expected);
    }

}