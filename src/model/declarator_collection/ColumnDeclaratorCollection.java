package model.declarator_collection;

import java.util.List;

import model.declarator.ColumnDeclarator;

public class ColumnDeclaratorCollection implements DeclaratorCollection{

	List<ColumnDeclarator> declarators;
	
	public ColumnDeclaratorCollection(List<ColumnDeclarator> declarators) {
		this.declarators = declarators;
	}
}
