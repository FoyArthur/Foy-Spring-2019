//@author: Arthur Foy
//3/3/2019
package textExcel;

public class EmptyCell implements Cell{
	public String abbreviatedCellText() {
		// text for spreadsheet cell display, must be exactly length 10
		return "          ";
	}
	public String fullCellText() {
		return " ";
	}// text for individual cell inspection, not truncated or padded
}
