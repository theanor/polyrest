package be.monolith.polyrest.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import be.monolith.polyrest.api.VehiclesApi;
import be.monolith.polyrest.model.Vehicle;
import io.swagger.annotations.ApiParam;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-13T10:07:13.239433100+02:00[Europe/Paris]")
@Controller
@RequestMapping("${openapi.vehicles.base-path:}")
public class VehiclesApiController implements VehiclesApi {

	private final NativeWebRequest request;

	private final static Vehicle[] VEHICLES = { VehiculeFactory.buildCar(0, "vw passat", "titine", false),
			VehiculeFactory.buildPlane(1, "acer", "piper", 4, false) };

	@org.springframework.beans.factory.annotation.Autowired
	public VehiclesApiController(NativeWebRequest request) {
		this.request = request;
	}

	@Override
	public Optional<NativeWebRequest> getRequest() {
		return Optional.ofNullable(request);
	}

	/**
	 * GET /vehicles : List all vehicles
	 *
	 * @return An paged array of vehicles (status code 200) or unexpected error
	 *         (status code 200)
	 */
	@Override
	public ResponseEntity<List<Vehicle>> vehiclesGet() {

		Optional<List<Vehicle>> opt = Optional.of(Arrays.asList(VEHICLES));
		return ResponseEntity.of(opt);

	}

	/**
	 * GET /vehicles/{id} : Info for a specific vehicle
	 *
	 * @param id The id of vehicle to retrieve (required)
	 * @return Expected response to a valid request (status code 200) or unexpected
	 *         error (status code 200)
	 */
	@Override
	public ResponseEntity<Vehicle> vehiclesIdGet(
			@ApiParam(value = "The id of vehicle to retrieve", required = true) @PathVariable("id") String id) {

		Optional<Vehicle> opt = Optional.of(VEHICLES[Integer.valueOf(id)]);
		return ResponseEntity.of(opt);

	}

}
