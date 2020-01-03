package model.declarator_collection;

import java.util.List;

import model.declarator.ColumnDeclarator;

public class ColumnDeclaratorCollection implements DeclaratorCollection{

	private List<ColumnDeclarator> declarators;
	
	public ColumnDeclaratorCollection(List<ColumnDeclarator> declarators) {
		this.declarators = declarators;
	}

	public List<ColumnDeclarator> getDeclarators() {
		return declarators;
	}

	public void setDeclarators(List<ColumnDeclarator> declarators) {
		this.declarators = declarators;
	}

	@Override
	public boolean equals(Object obj) {
		try {
			ColumnDeclaratorCollection compared = (ColumnDeclaratorCollection)obj;
			
			if(declarators.size() != compared.declarators.size()) return false;
			
			for(int i = 0; i < declarators.size(); i++) {
				if(!declarators.get(i).equals(compared.declarators.get(i))) return false;
			}
			
			return true;
			
		} catch(ClassCastException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
}
