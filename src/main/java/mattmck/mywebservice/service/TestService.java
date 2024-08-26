package mattmck.mywebservice.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
//@Transactional
@Slf4j
public class TestService {

//	@Autowired
//	private PgDbXaTestRepository pgDbXaTestRepository;

//	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = { Exception.class, RuntimeException.class })
	public String test() {
		return  "SUCCESS " + LocalDateTime.now();
	}

}
