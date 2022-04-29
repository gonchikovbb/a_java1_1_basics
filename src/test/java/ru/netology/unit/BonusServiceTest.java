package ru.netology.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateBonus() {
        BonusService bonusService = new BonusService();
        int amount = 2000;
        int expected = 10;
        int actual = bonusService.calculateBonus(amount);
        assertEquals(expected,actual);
    }
}