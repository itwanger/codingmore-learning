package top.codingmore;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class CodingmoreLogbackApplicationTests {
	static Logger logger = LoggerFactory.getLogger(CodingmoreLogbackApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("logback testing");
		LoggerContext lc = (LoggerContext)LoggerFactory.getILoggerFactory();
		StatusPrinter.print(lc);
	}

	@Test
	void testSlf4j() {
		log.info("沉默王二是个大煞笔");
	}
}
