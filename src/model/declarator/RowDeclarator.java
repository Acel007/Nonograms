package model.declarator;

import java.util.List;

public class RowDeclarator {

	private List<DeclaratorItem> declaratorItems;
	
	public RowDeclarator(List<DeclaratorItem> declaratorItems) {
		this.declaratorItems = declaratorItems;
	}

	public List<DeclaratorItem> getDeclaratorItems() {
		return declaratorItems;
	}

	public void setDeclaratorItems(List<DeclaratorItem> declaratorItems) {
		this.declaratorItems = declaratorItems;
	}
	
}
