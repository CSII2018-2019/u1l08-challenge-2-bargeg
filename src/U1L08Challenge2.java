//Genna Barge U1L08 missing number in array
public class U1L08Challenge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valueOfList = 0;
		int [] numbers = {2, 3, 4, 5, 7, 9, 8, 10, 1}; 
		
		int setValues = 55; 
		
		int length = numbers.length;
		int indexspots = length - 1;
		
		for (int i = 0; i < length; i++) {
			valueOfList += numbers[i];
		}
		int missingNum = setValues - valueOfList; 
		System.out.print("The missing number is: " + missingNum);
		}

	}


