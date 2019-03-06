//@author Arthur Foy

package textExcel;

//Update this file with your own code.


public class SpreadsheetLocation implements Location
{

	private char col;
	private int row;
	
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
    
    public SpreadsheetLocation(String cellName)
    {
        // TODO: Fill this out with your own code
    	cellName.toUpperCase();
		col = cellName.charAt(0);
		row = cellName.charAt(1);
    }

}
