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
	
}
