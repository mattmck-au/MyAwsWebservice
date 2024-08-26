package mattmck.mywebservice.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import mattmck.mywebservice.service.TestService;

@RestController
@Slf4j
public class TestController {

	@Autowired
	private TestService testService;

	@GetMapping("/test")
	public String testSuccess() {
		return testService.test();
	}
}
