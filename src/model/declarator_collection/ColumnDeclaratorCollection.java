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
}
