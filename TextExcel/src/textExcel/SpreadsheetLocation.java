//@author ArthurFoy
//@date 3/29/2019
package textExcel;

//class for location of cells on spreadsheet
public class SpreadsheetLocation implements Location
{

	private int col;
	private int row;
	
	//changes what user entered into correct column and row to then use for 2-D arrays
	public SpreadsheetLocation(String cellName){
	        // TODO: Fill this out with your own code
		String newCell = cellName.toUpperCase();
		col = newCell.charAt(0) - 65;
		row = Integer.parseInt(newCell.substring(1, newCell.length())) - 1;
	}
    @Override
    
    //returns number of rows
    public int getRow()
    {
        // TODO Auto-generated method stub
        return row;
    }

    //returns number of columns
    @Override
    public int getCol()
    {
        // TODO Auto-generated method stub
        return col;
    }
    

}
