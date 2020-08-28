import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateRegisteredAndInLimit() {
        BonusService service = new BonusService();
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);

        assertEquals(expected,actual);
    }


    @Test
    void shouldCalculateNotRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 100000_60;
        boolean registered = false;
        long expected = 500;

        long actual = service.calculate(amount, registered);

        assertEquals(expected,actual);
    }

    @Test
    void shouldCalculateRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 100000_60;
        boolean registered = true;
        long expected = 500;

        long actual = service.calculate(amount, registered);

        assertEquals(expected,actual);
    }

    @Test
    void shouldCalculateNotRegisteredAndInLimit() {
        BonusService service = new BonusService();
        long amount = 10000_60;
        boolean registered = false;
        long expected = 100;

        long actual = service.calculate(amount, registered);

        assertEquals(expected,actual);
    }
}