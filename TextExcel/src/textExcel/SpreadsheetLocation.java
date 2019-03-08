//@author Arthur Foy

package textExcel;

//Update this file with your own code.


public class SpreadsheetLocation implements Location
{

	private int col;
	private int row;
	
	
	public SpreadsheetLocation(String cellName){
	        // TODO: Fill this out with your own code
		String newCell = cellName.toUpperCase();
		col = newCell.charAt(0) - 65;
		row = Integer.parseInt(newCell.substring(1, newCell.length())) - 1;
	}
    @Override
    public int getRow()
    {
        // TODO Auto-generated method stub
        return row;
    }

    @Override
    public int getCol()
    {
        // TODO Auto-generated method stub
        return col;
    }
    

}
