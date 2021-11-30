package Flight_Booking;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/checkin")
public class checkin_controller {
@RequestMapping("/hey")
public String hey() {
	return "welcome to checkin";
}
}