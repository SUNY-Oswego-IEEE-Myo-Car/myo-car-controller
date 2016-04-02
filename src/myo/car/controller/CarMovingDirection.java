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

/**
 * The <code>CarMovingDirection</code> enum is used to represent the possible
 * moving directions of the Car.
 *
 * @see myo.car.controller.Car
 * @author Christopher Wells {@literal <cwellsny@nycap.rr.com>}
 */
public enum CarMovingDirection {

    /**
     * When the car is moving forwards.
     */
    FORWARDS,

    /**
     * When the car is moving backwards.
     */
    BACKWARDS,

    /**
     * When the car is not moving.
     */
    STATIONARY,
}
