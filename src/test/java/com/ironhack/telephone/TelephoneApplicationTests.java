package com.ironhack.telephone;

import com.ironhack.telephone.entities.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TelephoneApplicationTests {

	@Test
	void contextLoads() {

		Router router = new Router();
		router.getUser();

		User user = new User();
		user.getRouter();
	}

}
