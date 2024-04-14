package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car test_car;

    @BeforeEach
    public void initCar() {
        test_car = new Car("Toyota", "Prius", 10, 50);
    }

    //TODO: add emptyTest so we can configure our runtime environment
    @Test
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }

    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank() {
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }

    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankAfterDriving() {
        test_car.drive(50);
        assertEquals(9, test_car.getGasTankLevel(), .001);

    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range

    @Test
    public void testGasTankAfterExceedingTankRange() {
        test_car.drive(10000);
        assertTrue(test_car.getGasTankLevel() == 0);
    }

    // drive the distance of tank range *mph and tank should be at 0.
    //TODO: can't have more gas than tank size, expect an exception

    //TODO: can't have more gas than tank size, expect an exception
    @Test()
    public void testGasOverfillException() {
        assertThrows(IllegalArgumentException.class, () -> {
            test_car.addGas(5);
            assertTrue(test_car.getGasTankLevel() < test_car.getGasTankSize(), "Shouldn't get here," +
                    " car cannot have more gas in tank than the size of the tank");
        });
    }
}




