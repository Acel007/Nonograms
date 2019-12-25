package model.declarator;

import java.util.List;

public class ColumnDeclarator {

	private List<DeclaratorItem> declaratorItems;
	
	public ColumnDeclarator() {
		
	}

	public List<DeclaratorItem> getDeclaratorItems() {
		return declaratorItems;
	}

	public void setDeclaratorItems(List<DeclaratorItem> declaratorItems) {
		this.declaratorItems = declaratorItems;
	}
	
}
