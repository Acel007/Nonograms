package model.declarator_collection;

import java.util.List;

import model.declarator.RowDeclarator;

public class RowDeclaratorCollection  implements DeclaratorCollection{

	List<RowDeclarator> declarators;
	
	public RowDeclaratorCollection(List<RowDeclarator> declarators) {
		this.declarators = declarators;
	}
	
}
