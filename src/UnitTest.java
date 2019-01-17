import static org.junit.Assert.*;
import org.junit.Test;

/* This public class contains all the testing for the program. */

public class UnitTest {
	
	/* Tests */

	/* This test checks if the CipherMachine class exists. */
    @SuppressWarnings("unused")
	@Test
    public void TestCipherMachineClassExists() {
        CipherMachine cm = new CipherMachine();
    }
    /* This test checks that Part 1 method works with standard alphabet letters. */
    @Test
    public void TestCipherMachineMethod() {
        CipherMachine cm = new CipherMachine();
        
        assertEquals("d", cm.ElonEncoder("a", 3));
    }
    /* This test checks that Part 1 method works with capitalised alphabet letters. */
    @Test
    public void TestCipherMachineCapitalisationMethod() {
        CipherMachine cm = new CipherMachine();
        
        assertEquals("D", cm.ElonEncoder("A", 3));
    }
    /* This test checks that the method works with overhanging letters. */
    @Test
    public void TestCipherMachineOverhangingMethod() {
    	CipherMachine cm = new CipherMachine();
    	
    	assertEquals("a", cm.ElonEncoder("x", 3));
    }
    @Test
    public void TestCipherMachineCapitalOverhangingMethod() {
    	CipherMachine cm = new CipherMachine();
    	
    	assertEquals("A", cm.ElonEncoder("X", 3));
    }
    /* This test makes sure example 1 returns the expected result. */
    @Test
    public void TestCipherMachinePart1Method() {
    	CipherMachine cm = new CipherMachine();
    	
    	assertEquals("KhoorZruog", cm.ElonEncoder("HelloWorld", 3));
    }
    /* This test checks that Part 2 method returns the expected result. */
    @Test
    public void TestCipherMachinePart2Method() {
    	CipherMachine cm = new CipherMachine();
    	
    	assertEquals("[-, !, +, ,, ]]", cm.Part2TestEncoder("/:?#.", 1));
    }
    /* This test checks that Part 2 method preserves white spaces. */
    @Test
    public void TestCipherMachineWhiteSpacePart2Method() {
    	CipherMachine cm = new CipherMachine();
    	
    	assertEquals("- !", cm.ElonEncoder("/ :", 1));
    }
    /* This test checks that Part 2 returns a "_" for unrecognised characters. */
    @Test
    public void TestCipherMachineUnrecognisedCharacterPart2Method() {
    	CipherMachine cm = new CipherMachine();
    	
    	assertEquals("-!_", cm.ElonEncoder("/:[", 1));
    }
    /* This test makes sure Part 3 returns the expected result from the given example. */
    @Test
    public void TestCipherMachinePart3Method() {
    	CipherMachine cm = new CipherMachine();
    	
    	assertEquals("HelloWorld", cm.ElonDecoder("KhoorZruog", 3));
    }
    /* This test makes sure that Part 3 method keeps any "_" in the message. */
    @Test
    public void TestCipherMachinePart3KeepEncodedCharacterMethod() {
    	CipherMachine cm = new CipherMachine();
    	String input = "!_+";
    	
    	assertEquals(":_?", cm.ElonDecoder(input, 3));
    }
    /* This test makes sure that encoded characters are returned decoded. */
    @Test
    public void TestElonDecoderMethod() {
    	CipherMachine cm = new CipherMachine();

    	assertEquals(":", cm.ElonDecoder("!", 3));
    	assertEquals("?", cm.ElonDecoder("+", 3));
    	assertEquals("#", cm.ElonDecoder(",", 3));
    	assertEquals(".", cm.ElonDecoder("]", 3));
    	assertEquals("/", cm.ElonDecoder("-", 3));
    	assertEquals("_", cm.ElonDecoder("_", 3));
    	assertEquals("*", cm.ElonDecoder("?", 3));
    	assertEquals(" ", cm.ElonDecoder(" ", 3));
    }
    /* This tests part 4 by returning a decoded message. */
    @Test
    public void TestCipherMachinePart4Method() {
    	CipherMachine cm = new CipherMachine();
    	
    	assertEquals("Congratulations ... Tell nobody the password is: #Cheddar#", cm.ElonDecoder("Ugfyjslmdslagfk ]]] Lwdd fgtgvq lzw hskkogjv ak! ,Uzwvvsj,", 18));
    }
}
