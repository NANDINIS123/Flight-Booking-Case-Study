package Flight_Booking;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search_flights")
public class search_flight_controller {
@RequestMapping("/hey")
public String hey() {
	return "welcome to flight search";
}
}