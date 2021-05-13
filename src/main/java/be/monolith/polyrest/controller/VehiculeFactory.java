package be.monolith.polyrest.controller;

import be.monolith.polyrest.model.Car;
import be.monolith.polyrest.model.Plane;
import be.monolith.polyrest.model.Vehicle.TypeEnum;

public class VehiculeFactory {

	public static Car buildCar(Integer id, String model, String name, boolean has4WheelDrive) {
		Car car = new Car();
		car.setType(TypeEnum.CAR);
		car.setId(id);
		car.setModel(model);
		car.setName(name);
		car.setHas4WheelDrive(has4WheelDrive);
		return car;
	}

	public static Plane buildPlane(Integer id, String model, String name, Integer nbPassengers, Boolean hasReactor) {
		Plane plane = new Plane();
		plane.setType(TypeEnum.PLANE);
		plane.setId(id);
		plane.setModel(model);
		plane.setName(name);
		plane.setNbPassengers(nbPassengers);
		plane.setHasReactor(hasReactor);
		return plane;

	}

}
