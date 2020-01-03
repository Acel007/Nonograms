package model.picture;

import java.util.ArrayList;
import java.util.List;

public class PictureGrid {

	private List<List<GridItem>> pictureGrid = new ArrayList<>();
	
	public PictureGrid(List<List<GridItem>> pictureGrid) {
		this.pictureGrid.addAll(pictureGrid);
	}

	public List<List<GridItem>> getPictureGrid() {
		return pictureGrid;
	}

	public void setPictureGrid(List<List<GridItem>> pictureGrid) {
		this.pictureGrid = pictureGrid;
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			PictureGrid compared = (PictureGrid)obj;
			
			if(pictureGrid.size() != compared.pictureGrid.size()) return false;
			
			for(int i = 0; i < compared.pictureGrid.size(); i++) {
				if(pictureGrid.get(i).size() != compared.pictureGrid.get(i).size()) return false;
			}
			
			for(int i = 0; i < compared.pictureGrid.size(); i++) {
				for(int j = 0; j < pictureGrid.get(i).size(); j++) {
					if(!pictureGrid.get(i).get(j).equals(compared.pictureGrid.get(i).get(j))) return false;
				}
			}
			
			return true;
			
		} catch(ClassCastException e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
