package com.blogspot3.TimeZoneService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TimeZoneServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testOffsetSydney() {
		TimeZoneServiceApplication app = new TimeZoneServiceApplication();
		String expectedPlus10 = app.getTimeZoneOffset("2018-04-01T18:00:00", "Australia/Sydney");
		assertThat("+10:00").isEqualTo(expectedPlus10);
	}

}
