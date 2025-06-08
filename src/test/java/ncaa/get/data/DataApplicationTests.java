package ncaa.get.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = {
    "data.localsavepoint=localsave/point",
})
class DataApplicationTests {

	@Test
	void contextLoads() {
	}

}
