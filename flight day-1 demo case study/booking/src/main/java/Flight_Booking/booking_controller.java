package Flight_Booking;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
public class booking_controller {
@RequestMapping("/hey")
public String hey() {
	return "welcome to booking";
}
}
