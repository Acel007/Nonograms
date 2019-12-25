package model;

import model.declarator_collection.ColumnDeclaratorCollection;
import model.declarator_collection.RowDeclaratorCollection;
import model.picture.NonogramPicture;

public class Nonogram {
	
	private NonogramPicture nonogramPicture;
	private RowDeclaratorCollection rowDeclarators;
	private ColumnDeclaratorCollection columnDeclarators;
	
	public Nonogram(NonogramPicture picture, RowDeclaratorCollection rowDeclarators, ColumnDeclaratorCollection columnDeclarators) {
		this.nonogramPicture = picture;
		this.rowDeclarators = rowDeclarators;
		this.columnDeclarators = columnDeclarators;
	}

}
