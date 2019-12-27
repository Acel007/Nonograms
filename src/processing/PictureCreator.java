package processing;

import java.util.ArrayList;
import java.util.List;

import config.Config;
import model.picture.GridItem;
import model.picture.PictureGrid;

public class PictureCreator {
	
	/**
	 * Generates a PictureGrid from a list of Strings
	 * 
	 * @param inputLines	The list of Strings which are converted into a new PictureGrid
	 * @return	A new PictureGrid
	 */
	public static PictureGrid generatePicture(List<String> inputLines) {
		return new PictureGrid(generateGrid(inputLines));
	}
	
	/**
	 * Generates a list of lists of GridItems with a given input string list.
	 * 
	 * @param inputLines	The list of Strings which are converted into GridItems
	 * @return	A list of lists of GridItems
	 */
	private static List<List<GridItem>> generateGrid(List<String> inputLines){
		List<List<GridItem>> returnList = new ArrayList<>();
		
		for(int i = 0; i < inputLines.size(); i++) {
			returnList.add(generateGridItems(inputLines.get(i), i));
		}
		
		return returnList;
	}
	
	/**
	 * Generates a list of GridItems with a given input string and its position in a list of strings.
	 * 
	 * 
	 * @param line	The string which is converted into GridItems.
	 * @param y	The position of the current input string in the list of strings.
	 * @return	A new List of GridItems
	 */
	private static List<GridItem> generateGridItems(String line, int y){
		List<GridItem> returnList = new ArrayList<GridItem>();
		
		for(int i = 0; i < line.length(); i++) {
			returnList.add(generateGridItem(i, y, line.charAt(i)));
		}
		
		return returnList;
	}
	
	/**
	 * Generates a new GridItem.
	 * 
	 * @param x	The x-Index of the new GridItem.
	 * @param y	The y-Index of the new GridItem.
	 * @param gridItemChar	The content of the new GridItem, stored as a boolean whether or not it is filled.
	 * @return	A new GridItem
	 */
	private static GridItem generateGridItem(int x, int y, char gridItemChar) {
		
		return new GridItem(x, y, gridItemChar == Config.FILLED_GRIDITEM_CHAR);
		
	}
}
