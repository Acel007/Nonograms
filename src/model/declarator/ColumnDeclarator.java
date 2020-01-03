package model.declarator;

import java.util.List;

public class ColumnDeclarator implements Declarator{

	private List<DeclaratorItem> declaratorItems;
	
	public ColumnDeclarator(List<DeclaratorItem> declaratorItems) {
		this.declaratorItems = declaratorItems;
	}

	public List<DeclaratorItem> getDeclaratorItems() {
		return declaratorItems;
	}

	public void setDeclaratorItems(List<DeclaratorItem> declaratorItems) {
		this.declaratorItems = declaratorItems;
	}

	@Override
	public boolean equals(Object obj) {
		try {
			ColumnDeclarator compared = (ColumnDeclarator)obj;
			
			if(declaratorItems.size() != compared.declaratorItems.size()) return false;
			
			for(int i = 0; i < declaratorItems.size(); i++) {
				if(!declaratorItems.get(i).equals(compared.declaratorItems.get(i))) return false;
			}
			
			return true;
			
		} catch(ClassCastException e) {
			e.printStackTrace();
			return false;
		}
	}

	
}
