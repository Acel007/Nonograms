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

	public PictureGrid getNonogramPicture() {
		return nonogramPicture;
	}

	public void setNonogramPicture(PictureGrid nonogramPicture) {
		this.nonogramPicture = nonogramPicture;
	}

	public RowDeclaratorCollection getRowDeclarators() {
		return rowDeclarators;
	}

	public void setRowDeclarators(RowDeclaratorCollection rowDeclarators) {
		this.rowDeclarators = rowDeclarators;
	}

	public ColumnDeclaratorCollection getColumnDeclarators() {
		return columnDeclarators;
	}

	public void setColumnDeclarators(ColumnDeclaratorCollection columnDeclarators) {
		this.columnDeclarators = columnDeclarators;
	}

}
