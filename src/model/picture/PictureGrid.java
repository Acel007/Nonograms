package model.picture;

import java.util.List;

public class PictureGrid {

	private List<List<GridItem>> pictureGrid;
	
	public PictureGrid(List<List<GridItem>> pictureGrid) {
		this.pictureGrid.addAll(pictureGrid);
	}
	
}
