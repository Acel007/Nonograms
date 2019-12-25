package model;

import model.declarator_collection.ColumnDeclaratorCollection;
import model.declarator_collection.RowDeclaratorCollection;
import model.picture.PictureGrid;

public class Nonogram {
	
	private PictureGrid nonogramPicture;
	private RowDeclaratorCollection rowDeclarators;
	private ColumnDeclaratorCollection columnDeclarators;
	
	public Nonogram(PictureGrid picture, RowDeclaratorCollection rowDeclarators, ColumnDeclaratorCollection columnDeclarators) {
		this.nonogramPicture = picture;
		this.rowDeclarators = rowDeclarators;
		this.columnDeclarators = columnDeclarators;
	}

}
