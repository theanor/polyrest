package be.monolith.polyrest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import be.monolith.polyrest.controller.VehiculeFactory;
import be.monolith.polyrest.model.Vehicle;

public class DeserializationTests {

	@Test
	public void polymorphicArrayTest() throws JsonProcessingException {

		Vehicle[] vehicles = new Vehicle[] { VehiculeFactory.buildCar(0, "vw passat", "titine", false),
				VehiculeFactory.buildPlane(1, "acer", "piper", 4, false) };

		ObjectMapper mapper = new ObjectMapper();

		String vehiclesJSON = mapper.writeValueAsString(vehicles);

		Vehicle[] vehicles2 = mapper.readValue(vehiclesJSON, Vehicle[].class);

		assertEquals(vehicles.length, vehicles2.length);

		for (int i = 0; i < vehicles.length; i++) {
			assertEquals(vehicles[i], vehicles2[i]);
		}

	}

}
