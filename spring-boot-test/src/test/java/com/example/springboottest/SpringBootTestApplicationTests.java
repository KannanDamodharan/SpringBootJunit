package com.example.springboottest;

import com.example.springboottest.controller.TestController;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Slf4j
@ExtendWith(SpringExtension.class)
@SpringBootTest
class SpringBootTestApplicationTests {

	@Autowired
	TestController testController;

	@Test
	void contextLoads() {
		try {
			Assertions.assertThat(testController).isNot(null);
		}
		catch (Exception e){
			log.info("catch block executed");
		}
	}

}
