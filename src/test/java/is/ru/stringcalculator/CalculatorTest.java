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
		assertEquals(1+2, Calculator.add("1,2"));
	}

	@Test
	public void stringMultipleItem(){
		assertEquals(1+2+3, Calculator.add(";1,2,3"));
	}
	@Test
	public void stringMultipleItem2(){
		assertEquals(6+7+45+99, Calculator.add("\n6,7,45,99"));
	}

	@Test
	public void stringNewLineItem(){
		assertEquals(1+2+3, Calculator.add("1,2\n3"));
	}
	@Test
	public void stringStartsWithN(){
		assertEquals(3+4+6+15, Calculator.add("//;\n3,4;6;15"));
	}
	@Test
	public void stringStartsWithSemiComa(){
		assertEquals(3+4+6+15, Calculator.add("//;;3,4;6;15"));
	}
}