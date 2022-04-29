package ru.netology.unit;

//import org.junit.jupiter.api.Test;
import static org.testng.Assert.*;

//import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void shouldRemain100() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldRemainNext1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expected = 1000;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldRemain1() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldRemain999() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1001;
        int expected = 999;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void shouldRemain1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }
}