package top.codingmore;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CodingmoreLogbackApplicationTests {
	static Logger logger = LoggerFactory.getLogger(CodingmoreLogbackApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("logback testing");

		LoggerContext lc = (LoggerContext)LoggerFactory.getILoggerFactory();
		StatusPrinter.print(lc);
	}
}
