package by.komikow.restApp;

import by.komikow.restApp.controllers.DataController;
import by.komikow.restApp.services.DataService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class RestAppApplicationTests {
	@Autowired
	private DataController myController;
	@Autowired
	private DataService myService;

	@Test
	public void testContextLoads() throws Exception {
		assertThat(myController).isNotNull();
		assertThat(myService).isNotNull();
	}
}
