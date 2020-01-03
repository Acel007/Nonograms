package processing;

import java.util.ArrayList;
import java.util.List;

import model.declarator.ColumnDeclarator;
import model.declarator.DeclaratorItem;
import model.declarator.RowDeclarator;
import model.declarator_collection.ColumnDeclaratorCollection;
import model.declarator_collection.RowDeclaratorCollection;
import model.picture.GridItem;
import model.picture.PictureGrid;

public class PictureDeclarator {
	
	
	/**
	 * Generates a new RowDeclaratorCollection based on a PictureGrid.
	 * @param inputPicture	The PictureGrid which is to be declarated.
	 * @return	The RowDeclarators as a RowDeclaratorCollection.
	 */
	public static RowDeclaratorCollection generateRowDeclarators(PictureGrid inputPicture) {
		RowDeclaratorCollection rowDeclarators = new RowDeclaratorCollection(generateRowDeclarators(inputPicture.getPictureGrid()));
		
		
		
		return rowDeclarators;
	}
	
	/**
	 * Generates a new ColumnDeclaratorCollection based on a PictureGrid.
	 * @param inputPicture	The PictureGrid which is to be declarated.
	 * @return	The ColumnDeclarators as a ColumnDeclaratorCollection.
	 */
	public static ColumnDeclaratorCollection generateColumnDeclarators(PictureGrid inputPicture) {
		ColumnDeclaratorCollection columnDeclarators = new ColumnDeclaratorCollection(generateColumnDeclarators(inputPicture.getPictureGrid()));
		
		
		
		return columnDeclarators;
	}
	
	
	/**
	 * Generates a list of RowDeclarators using a two-dimensional GridItem list.
	 * <p>
	 * The two-dimensional list is read as rows from left to right.
	 * <p>
	 * When a row is read, a new list of DeclaratorItems is generated.
	 * <p>
	 * That list is used to create a RowDeclarator.
	 * <p>
	 * The process is repeated until the entire list of lists of GridItems is processed.
	 * <p>
	 * The function finally returns the list of RowDeclarators from the pictureGrid.
	 * 
	 * @param pictureGrid	The PictureGrid as a two-dimensional GridItem list.
	 * @return	The RowDeclarators generated using the PictureGrid(List of GridItem lists).
	 */
	private static List<RowDeclarator> generateRowDeclarators(List<List<GridItem>> pictureGrid){
		List<RowDeclarator> returnList = new ArrayList<>();
		
		for(List<GridItem> gridItems : pictureGrid) {
			returnList.add(new RowDeclarator(generateDeclaratorItems(gridItems)));
		}
		
		return returnList;
	}
	
	/**
	 * Generates a list of ColumnDeclarators using a two-dimensional GridItem list.
	 * <p>
	 * The two-dimensional list is read as columns from top to bottom.
	 * <p>
	 * When a column is read, a new list of DeclaratorItems is generated.
	 * <p>
	 * That list is used to create a ColumnDeclarator.
	 * <p>
	 * The process is repeated until the entire list of lists of GridItems is processed.
	 * <p>
	 * The function finally returns the list of ColumnDeclarators from the pictureGrid.
	 * 
	 * @param pictureGrid	The PictureGrid as a two-dimensional GridItem list.
	 * @return	The ColumnDeclarators generated using the PictureGrid(List of GridItem lists).
	 */
	private static List<ColumnDeclarator> generateColumnDeclarators(List<List<GridItem>> pictureGrid){
		List<ColumnDeclarator> returnList = new ArrayList<>();
		List<GridItem> temp = new ArrayList<>();
		int i = 0;
		
		while(i < pictureGrid.get(i).size()) {
		
			for(List<GridItem> gridItems : pictureGrid) {
				temp.add(gridItems.get(i));
			}
			
			returnList.add(new ColumnDeclarator(generateDeclaratorItems(temp)));
			
			i++;
		}
		
		return returnList;
	}
	
	/**
	 * Generates a list of DeclaratorItems using a list of GridItems.
	 * <p>
	 * A DeclaratorItem contains a list of GridItems, of which all are adjacent and filled with color.
	 * <p>
	 * Since a single line in a picture is able to contain several GridItems which are filled, but not adjacent, a list of DeclaratorItems is created.
	 * <p>
	 * When the function is finished, said list is returned.
	 * 
	 * @param gridItems	The GridItems of a single line
	 * @return	The DeclaratorItems generated using gridItems
	 */
	private static List<DeclaratorItem> generateDeclaratorItems(List<GridItem> gridItems) {
		List<DeclaratorItem> returnList = new ArrayList<>();
		List<GridItem> currentDeclaration = new ArrayList<>();
		
		for(GridItem item : gridItems) {
			if(item.isFilled()) {
				currentDeclaration.add(item);
			} else if(!currentDeclaration.isEmpty()){
				returnList.add(new DeclaratorItem(currentDeclaration));
				currentDeclaration.clear();
			}
		}
		
		return null;
	}
	
	
	
}
