package is.ru.stringcalculator;

public class Calculator {
	public static int add(String text){
		
		String delimiter = ",|\n";
		String numbersWithoutDelimiter = text;
		
		if(text.equals("")){
			return 0;
		}
		else if(text.startsWith("//")){
			//Finding the indexof delimiter
			int delimiterIndex = text.indexOf("//") + 2;
			//Adding the new delimiter to the orginal one
			delimiter = delimiter + "|" + text.substring(delimiterIndex, delimiterIndex + 1);
			numbersWithoutDelimiter = text.substring((delimiterIndex + 2));
		}
		//Removeing the delimter if it's in front of the number
		if(numbersWithoutDelimiter.startsWith("\n") || numbersWithoutDelimiter.startsWith(";")){
			numbersWithoutDelimiter = numbersWithoutDelimiter.substring(1);
		}
		return add(numbersWithoutDelimiter, delimiter);
	}

	private static int add(String text, String delimiter){
		return sum(text.split(delimiter));
	}

	private static int sum(String[] arrNumbers){
		int theSum = 0;			
			for(int i = 0; i < arrNumbers.length; i++){
				if(toInt(arrNumbers[i]) > 1000){
					theSum += 0;
				}
				else{
					theSum += toInt(arrNumbers[i]);	
				}
				
			}
		return theSum;
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}
}