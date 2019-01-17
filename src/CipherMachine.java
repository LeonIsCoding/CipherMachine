import java.util.ArrayList;
// This public class holds all related CipherMachine encoding and decoding properties and methods.
public class CipherMachine {
		
	// Methods
	
	// This method encodes symbols as well as letters by checking their ASCII value
	// returns String of encoded message.
    public String Part2TestEncoder(String input, int shift) {
    	ArrayList<Character>OutputList = new ArrayList<>();
    	char[] charArray = input.toCharArray();

    	ArrayList<Character> InputList = new ArrayList<>();
    	for (char c : charArray) {
    		InputList.add(c);
    	}
    	
    	/// ASCII Values ///
    	final int A = 65;
    	final int Z = 90;
    	final int a = 97;
    	final int z = 122;
    	final int colon = 58;
    	final int exclamationmark = 33;
    	final int frontslash = 47;
    	final int minus = 45;
    	final int questionmark = 63;
    	final int plus = 43;
    	final int numbermark = 35;
    	final int comma = 44;
    	final int period = 46;
    	final int rightsquarebracket = 93;
    	final int whitespace = 32;
    	final int underscore = 95;
    	
    	while (InputList.size() != 0) {
    		char character = InputList.get(0);
    		int value = (int) character;
    		switch (value) {
    		
    		case colon: {
    			int ascii = exclamationmark;
    			char output = (char) ascii;
    			OutputList.add(output);
    			InputList.remove(0);
    			break;
    		}
    		case frontslash: {
    			int ascii = minus;
    			char output = (char) ascii;
    			OutputList.add(output);
    			InputList.remove(0);
    			break;
    		}
    		case questionmark: {
    			int ascii = plus;
    			char output = (char) ascii;
    			OutputList.add(output);
    			InputList.remove(0);
    			break;
    		}
    		case numbermark: {
    			int ascii = comma;
    			char output = (char) ascii;
    			OutputList.add(output);
    			InputList.remove(0);
    			break;
    		}
    		case period: {
    			int ascii = rightsquarebracket;
    			char output = (char) ascii;
    			OutputList.add(output);
    			InputList.remove(0);
    			break;
    		}
    		default: {
    			int ascii = (int) character;
    			if (ascii >= A && ascii <= Z) {
    				ascii = ascii + shift;
            		char output = (char) ascii;
            		OutputList.add(output);
            		InputList.remove(0);
        			break;
    			} else if (ascii >= a && ascii <= z) {
    				ascii = ascii + shift;
            		char output = (char) ascii;
            		OutputList.add(output);
            		InputList.remove(0);
        			break;
    			} else if (ascii == whitespace){
        			char output = (char) ascii;
        			OutputList.add(output);
        			InputList.remove(0);
        			break;
    			} else {
    				ascii = underscore;
        			char output = (char) ascii;
        			OutputList.add(output);
        			InputList.remove(0);
        			break;
    			}
    		}
    	}
    }
    	return OutputList.toString();
   }
    // This method takes an incoming string and integer and shift the letters according to the shift value.
    // Returns an encoded string.
    public String ElonEncoder(String input, int shift) {
    	ArrayList<Character>OutputList = new ArrayList<>();
    	char[] charArray = input.toCharArray();
		String letter = "";
    	ArrayList<Character> InputList = new ArrayList<>();
    	for (char c : charArray) {
    		InputList.add(c);
    	}
    	int x = 0;
    	int ascii = 0;
    	char output;
    	
    	/// ASCII Values ///
    	final int A = 65;
    	final int Z = 90;
    	final int a = 97;
    	final int z = 122;
    	final int colon = 58;
    	final int exclamationmark = 33;
    	final int frontslash = 47;
    	final int minus = 45;
    	final int questionmark = 63;
    	final int plus = 43;
    	final int hashsymbol = 35;
    	final int comma = 44;
    	final int period = 46;
    	final int rightsquarebracket = 93;
    	final int underscore = 95;
    	final int whitespace = 32;
    	
    	while (InputList.size() != 0) {
    		
    		char character = InputList.get(0);
    		int value = (int) character;
    		// This checks the value of the ASCII value, 
    		// it first checks to see if the value matches a capital letter value
    		if (value >= A && value <= Z) {
    	            char c = (char)(input.charAt(x) + shift);
    	            // Checks the char 'c' to see if the new value exceeds the ASCII value of capital Z (90)
    	            if (c > 'Z')
    	            	// If true then subtract the value by 26 and the shift value
    	            	letter += (char)(input.charAt(x) - (26-shift));
    	            else
    	            	// Else adds the shift value to the ASCII value
    	            	letter += (char)(input.charAt(x) + shift);
    	            // The new letter is then added to the OutputList
    	            OutputList.add(letter.charAt(x));
    	            // and the old letter is removed from the InputList
            		InputList.remove(0);
            		x++;
            // This checks to see if the value matches a standard letter value
    		} else if (value >= a && value <= z) {
    	            char c = (char)(input.charAt(x) + shift);
    	            // Checks the char 'c' to see if the new value exceeds the ASCII value of standard z (122)
    	            if (c > 'z')
    	            	// If true then subtract the value by 26 and the shift value
    	            	letter += (char)(input.charAt(x) - (26-shift));
    	            else
    	            	letter += (char)(input.charAt(x) + shift);
    	            OutputList.add(letter.charAt(x));
            		InputList.remove(0);
            		x++;
            // If the ASCII value does not match any letters, then it will check to 
            // see if it matches the value of a specific symbol
    		} else {
    			switch (value) {
        		
        		case colon: {
        			ascii = exclamationmark;
        			output = (char) ascii;
        			OutputList.add(output);
        			InputList.remove(0);
        			break;
        		}
        		case frontslash: {
        			ascii = minus;
        			output = (char) ascii;
        			OutputList.add(output);
        			InputList.remove(0);
        			break;
        		}
        		case questionmark: {
        			ascii = plus;
        			output = (char) ascii;
        			OutputList.add(output);
        			InputList.remove(0);
        			break;
        		}
        		case hashsymbol: {
        			ascii = comma;
        			output = (char) ascii;
        			OutputList.add(output);
        			InputList.remove(0);
        			break;
        		}
        		case period: {
        			ascii = rightsquarebracket;
        			output = (char) ascii;
        			OutputList.add(output);
        			InputList.remove(0);
        			break;
        		}
        		
        		// If we reach here, then ASCII value did not match any of the specified symbol
        		default: {
        			ascii = (int) character;
        			// It first checks to see if the ASCII value matches that of a white space
        			if (ascii == whitespace) {
        				// If true then keep ASCII value as white space
        			} else {
        			// Else it will assign the ASCII value the same as an underscore
        				ascii = underscore;
        			}
        			output = (char) ascii;
        			OutputList.add(output);
        			InputList.remove(0);
        		}       		
    		}
    	}
    }
    	// Once we reach down here, the program makes a new String and assigns it the OutputList
    	// as a string but all symbols made by the list itself are removed.
    	String FormattedOutput = OutputList.toString().replaceAll("\\[|\\]|[,][ ]", "");    	
    	return FormattedOutput;
    }
    // This method decodes an incoming string by a shift value.
    // returns decoded string.
    public String ElonDecoder(String input, int shift) {
    	ArrayList<Character>OutputList = new ArrayList<>();
    	char[] charArray = input.toCharArray();
		String letter = "";
    	ArrayList<Character> InputList = new ArrayList<>();
    	for (char c : charArray) {
    		InputList.add(c);
    	}
    	int x = 0;
    	int y = 0;
    	
    	/// ASCII Values ///
    	final int A = 65;
    	final int Z = 90;
    	final int a = 97;
    	final int z = 122;
    	final int exclamationmark = 33;
    	final int colon = 58;
    	final int minus = 45;
    	final int frontslash = 47;
    	final int plus = 43;
    	final int questionmark = 63;
    	final int comma = 44;
    	final int numbermark = 35;
    	final int rightsquarebracket = 93;
    	final int period = 46;
    	final int whitespace = 32;
    	final int underscore = 95;
    	final int asterisk = 42;
    	
    	while (InputList.size() != 0) {
    		
    		char character = InputList.get(0);
    		int value = (int) character;
    		
    		if (value >= A && value <= Z) {
    	            char c = (char)(input.charAt(y) - shift);
    	            // Checks the char 'c' to see if the new value is lower than the ASCII value of A (65)
    	            if (c < 'A')
    	            	letter += (char)(input.charAt(y) + (26-shift));
    	            else
    	            	letter += (char)(input.charAt(y) - shift);
    	            	OutputList.add(letter.charAt(x));
    	            	InputList.remove(0);
    	            	x++;
    	            	y++;
    		} else if (value >= a && value <= z) {
    	            char c = (char)(input.charAt(y) - shift);
    	            if (c < 'a')
    	            	letter += (char)(input.charAt(y) + (26-shift));
    	            else
    	            	letter += (char)(input.charAt(y) - shift);
    	            OutputList.add(letter.charAt(x));
            		InputList.remove(0);
            		x++;
            		y++;
    		} else {
    			switch (value) {

        		case exclamationmark: {
        			int ascii = colon;
        			char output = (char) ascii;
        			OutputList.add(output);
        			InputList.remove(0);
            		y++;
        			break;
        		}
        		case minus: {
        			int ascii = frontslash;
        			char output = (char) ascii;
        			OutputList.add(output);
        			InputList.remove(0);
            		y++;
        			break;
        		}
        		case plus: {
        			int ascii = questionmark;
        			char output = (char) ascii;
        			OutputList.add(output);
        			InputList.remove(0);
            		y++;
        			break;
        		}
        		case comma: {
        			int ascii = numbermark;
        			char output = (char) ascii;
        			OutputList.add(output);
        			InputList.remove(0);
            		y++;
        			break;
        		}
        		case rightsquarebracket: {
        			int ascii = period;
        			char output = (char) ascii;
        			OutputList.add(output);
        			InputList.remove(0);
            		y++;
        			break;
        		}
        		default: {
            		// If we reach here, then ASCII value did not match any of the specified symbol
        			int ascii = (int) character;
        			if (ascii == whitespace) {
            			char output = (char) ascii;
            			OutputList.add(output);
            			InputList.remove(0);
                		y++;
            			break;
        			} else if (ascii == underscore) {
            			char output = (char) ascii;
            			OutputList.add(output);
            			InputList.remove(0);
                		y++;
            			break;
        			} else {
        				ascii = asterisk;
        				char output = (char) ascii;
            			OutputList.add(output);
            			InputList.remove(0);
                		y++;
            			break;
        			}
    		}
    	}
   	}
   }
    	String output = OutputList.toString().replaceAll("\\[|\\]|[,][ ]", "");    	
    	return output;
    }
}
