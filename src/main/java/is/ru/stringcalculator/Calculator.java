package is.ru.stringcalculator;

public class Calculator{

	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		else if(text.contains(",")){		
			return sum(arrNumbers(text));
		}
		else{
			return 1;
		}
	}
	
	private static String[] arrNumbers(String text){
		return text.split(",");
	}

	private static int sum(String[] arrNumbers){

		int theSum = 0;			
			for(int i = 0; i < arrNumbers.length; i++){
				theSum += toInt(arrNumbers[i]);
			}
		return theSum;
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}
}