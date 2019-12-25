package model.picture;

public class GridItem {
	
	private int lengthIndex;
	private int heightIndex;
	
	private boolean isFilled;
	
	public GridItem(int lengthIndex, int heightIndex, boolean isFilled) {
		this.lengthIndex = lengthIndex;
		this.heightIndex = heightIndex;
		
		this.isFilled = isFilled;
	}
}
