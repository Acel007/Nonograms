package model.declarator_collection;

import java.util.List;

import model.declarator.RowDeclarator;

public class RowDeclaratorCollection  implements DeclaratorCollection{

	private List<RowDeclarator> declarators;
	
	public RowDeclaratorCollection(List<RowDeclarator> declarators) {
		this.declarators = declarators;
	}

	public List<RowDeclarator> getDeclarators() {
		return declarators;
	}

	public void setDeclarators(List<RowDeclarator> declarators) {
		this.declarators = declarators;
	}

	@Override
	public boolean equals(Object obj) {
		try {
			RowDeclaratorCollection compared = (RowDeclaratorCollection)obj;
			
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
