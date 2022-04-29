package ru.netology.unit;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldRemain100() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void shouldRemain0() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void shouldRemain1() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void shouldRemain999() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1001;
        int expected = 999;
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected,actual);
    }
    @org.junit.Test
    public void shouldRemain1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected,actual);
    }
}