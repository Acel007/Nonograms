package model.declarator;

import java.util.List;

import model.picture.GridItem;

public class DeclaratorItem{

	private List<GridItem> declaratorObject;
	
	public DeclaratorItem(List<GridItem> gridItems) {
		declaratorObject.addAll(gridItems);
	}

	public List<GridItem> getDeclaratorObject() {
		return declaratorObject;
	}

	public void setDeclaratorObject(List<GridItem> declaratorObject) {
		this.declaratorObject = declaratorObject;
	}

	@Override
	public boolean equals(Object obj) {
		try {
			DeclaratorItem compared = (DeclaratorItem)obj;
			
			if(declaratorObject.size() != compared.declaratorObject.size()) return false;
			
			for(int i = 0; i < declaratorObject.size(); i++) {
				if(!declaratorObject.get(i).equals(compared.declaratorObject.get(i))) return false;
			}
			
			return true;
			
		} catch(ClassCastException e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
