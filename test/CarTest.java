/*
 * Copyright (C) 2016 Christopher Wells <cwellsny@nycap.rr.com>
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package myo.car.controller;

import static myo.car.controller.CarMovingDirection.*;
import static myo.car.controller.CarTurningDirection.*;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * The <code>CarTest</code> classcontains test of the <code>Car</code> class.
 *
 * @see myo.car.controller.Car
 * @author Christopher Wells {@literal <cwellsny@nycap.rr.com>}
 */
public class CarTest {

    /**
     * Test of the constructor of the Car class.
     */
    @Test
    public void testConstructor(){
        Car car = new Car();

        assertEquals(STATIONARY, car.getMovingDirection());
        assertEquals(STRAIGHT, car.getTurningDirection());
    }

    /**
     * Test of the moveForwards method, of class Car.
     */
    @Test
    public void testMoveForwards() {
        Car car = new Car();        

        car.moveForwards();
        assertEquals(FORWARDS, car.getMovingDirection());
    }

    /**
     * Test of the moveBackwards method, of class Car.
     */
    @Test
    public void testMoveBackwards() {
        Car car = new Car();

        car.moveBackwards();
        assertEquals(BACKWARDS, car.getMovingDirection());
    }

    /**
     * Test of the stopMoving method, of class Car.
     */
    @Test
    public void testStopMoving() {
        Car car = new Car();

        car.moveForwards();
        car.stopMoving();
        assertEquals(STATIONARY, car.getMovingDirection());
    }

    /**
     * Test of the turnLeft method, of class Car.
     */
    @Test
    public void testTurnLeft() {
        Car car = new Car();

        car.turnLeft();
        assertEquals(LEFT, car.getTurningDirection());
    }

    /**
     * Test of the turnRight method, of class Car.
     */
    @Test
    public void testTurnRight() {
        Car car = new Car();

        car.turnRight();
        assertEquals(RIGHT, car.getTurningDirection());
    }

    /**
     * Test of the stopTurning method, of class car.
     */
    @Test
    public void testStopTurning() {
        Car car = new Car();

        car.turnLeft();
        car.stopTurning();
        assertEquals(STRAIGHT, car.getTurningDirection());
    }

}
