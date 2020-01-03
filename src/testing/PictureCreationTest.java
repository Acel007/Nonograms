package testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import model.picture.GridItem;
import model.picture.PictureGrid;
import processing.PictureCreator;

public class PictureCreationTest {
	
	private static List<String> testInput;
	private PictureGrid testGrid;
	private PictureGrid comparedGrid;
	
	@Before
	public void initTestInput() {
		testInput = new ArrayList<>();
		testInput.add(" X  ");
		testInput.add("XXXX");
		testInput.add(" X  ");
		testInput.add(" X  ");
	}
	
	@Before
	public void initTest() {
		List<List<GridItem>> testGridItems = new ArrayList<>();
		
		//TEST CONTAINERS
		testGridItems = new ArrayList<>();
		
		List<GridItem> rowOneItems = new ArrayList<>();
		List<GridItem> rowTwoItems = new ArrayList<>();
		List<GridItem> rowThreeItems = new ArrayList<>();
		List<GridItem> rowFourItems = new ArrayList<>();
		
		//ADDING TEST CONTAINER CONTENT
		
		//ROW ONE
		rowOneItems.add(new GridItem(0, 0, false));
		rowOneItems.add(new GridItem(1, 0, true));
		rowOneItems.add(new GridItem(2, 0, false));
		rowOneItems.add(new GridItem(3, 0, false));
		testGridItems.add(rowOneItems);
		rowOneItems = null;
		
		//ROW TWO
		rowTwoItems.add(new GridItem(0, 1, true));
		rowTwoItems.add(new GridItem(1, 1, true));
		rowTwoItems.add(new GridItem(2, 1, true));
		rowTwoItems.add(new GridItem(3, 1, true));
		testGridItems.add(rowTwoItems);
		rowTwoItems = null;
		
		//ROW THREE
		rowThreeItems.add(new GridItem(0, 2, false));
		rowThreeItems.add(new GridItem(1, 2, true));
		rowThreeItems.add(new GridItem(2, 2, false));
		rowThreeItems.add(new GridItem(3, 2, false));
		testGridItems.add(rowThreeItems);
		rowThreeItems = null;
		
		//ROW FOUR
		rowFourItems.add(new GridItem(0, 3, false));
		rowFourItems.add(new GridItem(1, 3, true));
		rowFourItems.add(new GridItem(2, 3, false));
		rowFourItems.add(new GridItem(3, 3, false));
		testGridItems.add(rowFourItems);
		rowFourItems = null;
		
		testGrid = new PictureGrid(testGridItems);
		
		comparedGrid = PictureCreator.generatePicture(testInput);
	}
	
	@Test
	public void gridContentEqualityTest() {
		assertTrue(comparedGrid.equals(testGrid));
	}

}
