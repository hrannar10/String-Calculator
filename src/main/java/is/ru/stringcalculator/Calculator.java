package is.ru.stringcalculator;

public class Calculator{

	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		else
			return 1;
		//else if(text.contains(","){
		//	String[] number = text.split(",");
		//	return Integer.praseInt(number[0]) + Integer.praseInt(number[1]);
		//}
	}
}