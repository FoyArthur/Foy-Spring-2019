//@author: Arthur Foy
//3/3/2019
package textExcel;

//cell that is just 10 spaces
public class EmptyCell implements Cell{
	// text for spreadsheet cell display, must be exactly length 10
	public String abbreviatedCellText() {
		return "          ";
	}
	
	// text for individual cell inspection, not truncated or padded
	public String fullCellText() {
		return "";
	}
}
