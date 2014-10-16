package is.ru.stringcalculator;

public class Calculator{

	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		//else if(text.contains("//")){
//
//		}
		//else{
			else if(text.contains(",") || text.contains("\n")){		
				return sum(arrNumbers(text));
			}
			else{
				return toInt(text);
			}
		//}
	}
	
	private static String[] arrNumbers(String text){
		return text.split(",|\n");
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
/*
public static int add(final String numbers) {
    String delimiter = ",|n";
    String numbersWithoutDelimiter = numbers;
    if (numbers.startsWith("//")) {
        int delimiterIndex = numbers.indexOf("//") + 2;
        delimiter = numbers.substring(delimiterIndex, delimiterIndex + 1);
        numbersWithoutDelimiter = numbers.substring(numbers.indexOf("n") + 1);
    }
    return add(numbersWithoutDelimiter, delimiter);
}
 
private static int add(final String numbers, final String delimiter) {
    int returnValue = 0;
    String[] numbersArray = numbers.split(delimiter);
    for (String number : numbersArray) {
        if (!number.trim().isEmpty()) {
            returnValue += Integer.parseInt(number.trim());
        }
    }
    return returnValue;
}*/