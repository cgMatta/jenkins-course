package org.testproject.jenkinscourse;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class JenkinsCourseApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testingSuccess(){
		System.out.println("Hello World");
		assertTrue(true);
	}

	@Test
	void testingFailure(){
		assertTrue(true);
	}

	@Test
	void anotherTest(){
		assertTrue(true);
	}

}
