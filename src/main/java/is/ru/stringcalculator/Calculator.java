package is.ru.stringcalculator;
import java.util.ArrayList;

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

		ArrayList<Integer> negNum = new ArrayList<Integer>();
			for(int i = 0; i < arrNumbers.length; i++){

				int indexNumber = toInt(arrNumbers[i]);
				if(indexNumber < 0){
					negNum.add(indexNumber);
				}
				else if(toInt(arrNumbers[i]) > 1000){
					theSum += 0;
				}
				else{
				theSum += toInt(arrNumbers[i]);	
				}
			}
			if(negNum.size() > 0){
				throw new RuntimeException("Negatives not allowed: " + negNum);
			}
		return theSum;
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}
}