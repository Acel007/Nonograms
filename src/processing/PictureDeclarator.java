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
	
	
	
	public static RowDeclaratorCollection generateRowDeclarators(PictureGrid inputPicture) {
		RowDeclaratorCollection rowDeclarators = new RowDeclaratorCollection(generateRowDeclarators(inputPicture.getPictureGrid()));
		
		
		
		return rowDeclarators;
	}
	
	public static ColumnDeclaratorCollection generateColumnDeclarators(PictureGrid inputPicture) {
		ColumnDeclaratorCollection columnDeclarators = new ColumnDeclaratorCollection(generateColumnDeclarators(inputPicture.getPictureGrid()));
		
		
		
		return columnDeclarators;
	}
	
	private static List<RowDeclarator> generateRowDeclarators(List<List<GridItem>> pictureGrid){
		List<RowDeclarator> returnList = new ArrayList<>();
		
		for(List<GridItem> gridItems : pictureGrid) {
			returnList.add(new RowDeclarator(generateDeclaratorItems(gridItems)));
		}
		
		return returnList;
	}
	
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
