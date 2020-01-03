package processing;

import java.util.List;

import model.declarator_collection.ColumnDeclaratorCollection;
import model.declarator_collection.RowDeclaratorCollection;
import model.main.Nonogram;
import model.picture.PictureGrid;

public class NonogramCreator {

	public Nonogram createNonogram(List<String> rawInput) {
		PictureGrid picture = PictureCreator.generatePicture(rawInput);
		RowDeclaratorCollection rows = PictureDeclarator.generateRowDeclarators(picture);
		ColumnDeclaratorCollection columns = PictureDeclarator.generateColumnDeclarators(picture);
		
		return new Nonogram(picture, rows, columns);
	}
	
}
