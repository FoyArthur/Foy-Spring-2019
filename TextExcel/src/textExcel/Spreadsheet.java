//@author Arthur Foy
//3/6/2019
package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private int rows;
	private int cols;
	private Cell[][] sheet;
	public Spreadsheet() {
		sheet = new EmptyCell[20][12];
		rows = 20;
		cols = 12;
	}
	@Override
	public String processCommand(String command)
	{
		// TODO Auto-generated method stub	
		return "";
	}

	@Override
	public int getRows()
	{
		return rows;
	}

	@Override
	public int getCols()
	{
		// TODO Auto-generated method stub
		return cols;
	}

	@Override
	public Cell getCell(Location loc)
	{
		// TODO Auto-generated method stub
		return sheet[loc.getCol()][loc.getRow()];
	}

	@Override
	public String getGridText()
	{
						
		// TOD\O Auto-generated method stub
		return null;
	}

}
