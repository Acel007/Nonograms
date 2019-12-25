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

	public int getLengthIndex() {
		return lengthIndex;
	}

	public void setLengthIndex(int lengthIndex) {
		this.lengthIndex = lengthIndex;
	}

	public int getHeightIndex() {
		return heightIndex;
	}

	public void setHeightIndex(int heightIndex) {
		this.heightIndex = heightIndex;
	}

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}
}
