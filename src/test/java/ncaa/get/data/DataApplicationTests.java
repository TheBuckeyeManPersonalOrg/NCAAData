package ncaa.get.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = {
    "data.localsavepoint=localsave/point",
	"api.url=https://api.example.com/data",
})
class DataApplicationTests {

	@Test
	void contextLoads() {
	}

}
