package Flight_Booking;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fares")
public class fares_controller {
@RequestMapping("/hey")
public String hey() {
	return "welcome to fares";
}
}
