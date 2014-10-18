package is.ru.stringcalculator;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Calculator{

	public static int add(String text){

		String delimiter ="";

		if(text.equals("")){
			return 0;	
		} 
		else if(text.length() == 1){
			return toInt(text);
		}
		else if(text.startsWith("//") || text.startsWith("\\")){
			if(!text.contains("[")){
				delimiter = text.substring(2,3);
				text = text.substring(4);
			}
			else{
				int indexCloseBracket = text.indexOf("]");
                int indexOpenBracket = text.indexOf("[");

                int delimiterSize = indexCloseBracket - indexOpenBracket;
                delimiter = text.substring(indexOpenBracket + 1, indexCloseBracket);
                text = text.substring(indexCloseBracket + 2, text.length() - 2);

				delimiter = Pattern.quote(delimiter);
				delimiter = "[" + delimiter + "]";

	            return sum(toInts(text.split(delimiter)));
                }
             }

			String regex = "[" + delimiter + ", \n ]";

			return sum(toInts(text.split(regex)));
	}
     public static Integer toInt(String number){
            return Integer.parseInt(number);
    }

    public static ArrayList<Integer> toInts(String[] strings){
			ArrayList<Integer> ints = new ArrayList<Integer>();
            for(int i = 0; i < strings.length; i++){
				if ((strings[i]).equals("") || strings[i] == null){
					continue;
				}
				else{
                    ints.add(toInt(strings[i]));
				}
                }
			return ints;
    }
	public static int sum(ArrayList<Integer> numbers){
		ArrayList<Integer> negNum = new ArrayList<Integer>();	
		int theSum = 0;

		for(int i = 0; i < numbers.size(); i++){
			if(numbers.get(i) < 0){
				negNum.add(numbers.get(i));
			}
			else if(numbers.get(i) > 1000){
				theSum += 0;
			}
			else{
				theSum += numbers.get(i);
			}
		}
		if(negNum.size() > 0){
			throw new RuntimeException("Negatives not allowed: " + negNum);
		}
		return theSum;
	}
}





