package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest{

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }

	@Test
	public void emptyString(){
		assertEquals(0, Calculator.add(""));
	}
	
	@Test
	public void stringOneItem(){
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void stringTwoItem(){
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
	public void stringMultipleItem(){
		assertEquals(6, Calculator.add("1,2,3"));
	}

	@Test
	public void stringNewLineItem(){
		assertEquals(6, Calculator.add("1,2\n3"));
	}
}