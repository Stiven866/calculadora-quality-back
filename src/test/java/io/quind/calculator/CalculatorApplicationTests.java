package io.quind.calculator;

import io.quind.calculator.service.CalculatorContoller;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class CalculatorApplicationTests {

	@Test
	void contextLoads() {
		float op1=2;
		float op2=5;
		CalculatorContoller ob1 = new CalculatorContoller();


		assertEquals(String.valueOf(7.0), ob1.addGetRequest(op1,op2));

	}

}
