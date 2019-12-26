package testing;

import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import input.NonogramReader;

public class NonogramReaderTest {
	
	private static List<String> testFileContents;

	@Before
	public void initTest() {
		
		testFileContents = new ArrayList<>();
		
		testFileContents.add("XXXXXXXXXX");
		testFileContents.add("XXXXXXXXX ");
		testFileContents.add("XXXXXXXX  ");
		testFileContents.add("XXXXXXX   ");
		testFileContents.add("XXXXXX    ");
		testFileContents.add("XXXXX     ");
		testFileContents.add("XXXX      ");
		testFileContents.add("XXX       ");
		testFileContents.add("XX        ");
		testFileContents.add("X         ");
		
	}
	
	@Test
	public void inputReaderTest() {
		List<String> inputLines = new NonogramReader("Testfiles\\inputTest.txt").readRawInput();
		
		assertFalse(testFileContents.retainAll(inputLines));
		
	}

}
