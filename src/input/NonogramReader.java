package input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class NonogramReader {

	private String path;
	
	public NonogramReader(String inputPath) {
		path = inputPath;
	}
	
	public List<String> readRawInput(){
		try {
			return Files.readAllLines(Paths.get(path));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
