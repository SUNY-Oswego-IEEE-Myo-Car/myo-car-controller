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

/**
 * The <code>Car</code> class is used to represent the Myo Car.
 * <br><br>
 * It includes information on the state of the car, as well as methods that can
 * be used to change the state of the car.
 *
 * @see myo.car.controller.CarMovingDirection
 * @see myo.car.controller.CarTurningDirection
 * @author Christopher Wells {@literal <cwellsny@nycap.rr.com>}
 */
public class Car {

    private CarMovingDirection movingDirection;
    private CarTurningDirection turningDirection;

    /**
     * Initialize an object of the <code>Car</code> class with no initial
     * moving or turning direction.
     */
    public Car() {
        this.movingDirection = STATIONARY;
        this.turningDirection = STRAIGHT;
    }

}
