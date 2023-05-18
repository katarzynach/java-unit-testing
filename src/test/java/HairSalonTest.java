import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HairSalonTest {

    HairSalon hairSalon = new HairSalon();

    @Test
    public void testGetOpeningDays() {
        String[] expected =  {"Monday", "Tuesday"};
        String[] actual = hairSalon.getOpeningDays();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSalonIsOpenOnMonday() {
        assertTrue(hairSalon.isOpen("Monday"));
    }

    @Test
    public void testSalonIsClosedOnWednesday() {
        assertFalse(hairSalon.isOpen("Wednesday"));
    }

    @Test
    public void testExceptionIsThrownIfWeekdayDoesNotEndInDay() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> hairSalon.isOpen("asd"));
        String expected = "Only weekdays are valid";
        String actual =exception.getMessage();
        assertEquals(expected, actual);
    }

}