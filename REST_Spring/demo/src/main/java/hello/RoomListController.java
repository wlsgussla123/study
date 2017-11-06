package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class RoomListController {
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/rooms")
	public RoomList greeting() {
		return new RoomList(counter.incrementAndGet(), "Romance in Prague", "http://placehold.it/150/30ac17");
	}
}
