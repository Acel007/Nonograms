package model.declarator;

import java.util.List;

import model.picture.GridItem;

public class DeclaratorItem {

	private List<GridItem> declaratorObject;
	
	public DeclaratorItem(List<GridItem> gridItems) {
		declaratorObject.addAll(gridItems);
	}
	
}
