package conversor;

import java.util.HashMap;

public class Conversor {
	
	/**
	 * . Method decimalToBinary() initializes an array with a length of 1000 to store the binary digits.
	 * . It initializes a variable 'i' to keep track of the current index in the binary array.
	 * . Then, it enters a while loop that continues until the decimal number reaches 0.
	 * . Inside the loop, it calculates the binary digit corresponding to the least significant bit of the number
	 *   using the modulus operator % with 2, and stores it in the binary array at index i.
	 * . It then divides the number by 2 to shift to the next bit (num /= 2).
	 * . It increments i to move to the next index in the binary array.
	 * . Finally, the method prints the binary number by doing an inverse iteration.
	 */
	private void decimalToBinary(int num) {
		
		int[] binary = new int[1000];
		int i = 0;
		
		while(num > 0) {
			binary[i] = num % 2;
			num /= 2;
			i++;
		}
		
		for(int j = i-1; j >= 0; j--) {
			System.out.print(binary[j]);
		}
		
		System.out.println("");
		
	}
	
	/**
	 * The decimalToHexadecimal() method does basically the same as the binary converter, but with some additions.
	 * . The hexadecimal values ('0', '1', '2', '3', ... 'F') are taken from a HashMap created and initialized at the
	 *   end of the class.
	 * . The variable 'temp' is used to store the 'num % 16' value, and to find the hexadecimal digit corresponding
	 *   to the decimal digit.
	 * . Then, the hexadecimal digit is added to a 'hexadecimal' String array.
	 * . If the hexadecimal number is less than 4 digits, the method adds zeros until it reaches 4 digits. 
	 */
	private void decimalToHexadecimal(int num) {
		
		String[] hexadecimal = new String[1000];
		int i = 0;
		int temp = 0;
		HashMap<Integer, String> values = getHexValues();
		
		while(num > 0) {
			temp = num % 16;
			hexadecimal[i] = values.get(temp);
			num /= 16;
			i++;
		}
		
		while(i < 4) {
	        hexadecimal[i] = "0";
	        i++;
	    }
		
		for(int j = i-1; j >= 0; j--) {
			System.out.print(hexadecimal[j]);
		}
		
		System.out.println("");
		
	}
	
	/**
	 * Print binary conversion 
	 */
	public void printBinary(int n) {
		System.out.println("Decimal = " + n);
		System.out.print("Binary = ");
		decimalToBinary(n);
		System.out.println("-------------------");
	}
	
	/**
	 * Print hexadecimal conversion 
	 */
	public void printHexadecimal(int n) {
		System.out.println("Decimal = " + n);
		System.out.print("Hexadecimal = 0x");
		decimalToHexadecimal(n);
		System.out.println("-------------------");
	}
	
	/**
	 * HashMap containing the hexadecimal values. 
	 */
	private HashMap<Integer, String> getHexValues() {
		
		HashMap<Integer, String> hexValues = new HashMap<>();
		hexValues.put(0, "0");
		hexValues.put(1, "1");
		hexValues.put(2, "2");
		hexValues.put(3, "3");
		hexValues.put(4, "4");
		hexValues.put(5, "5");
		hexValues.put(6, "6");
		hexValues.put(7, "7");
		hexValues.put(8, "8");
		hexValues.put(9, "9");
		hexValues.put(10, "A");
		hexValues.put(11, "B");
		hexValues.put(12, "C");
		hexValues.put(13, "D");
		hexValues.put(14, "E");
		hexValues.put(15, "F");
		
		return hexValues;
		
	}
	
}
