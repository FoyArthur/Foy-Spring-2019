//@author Arthur Foy
//3/6/2019
package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private int numRows;
	private int numCols;

	@Override
	public String processCommand(String command)
	{
		// TODO Auto-generated method stub
		command.toUpperCase();
		numCols = command.charAt(0) - 65;
		numRows = Integer.parseInt(command.substring(1, command.length()));
		return " ";
	}

	@Override
	public int getRows()
	{
		return numRows;
	}

	@Override
	public int getCols()
	{
		// TODO Auto-generated method stub
		return numCols;
	}

	@Override
	public Cell getCell(Location loc)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGridText()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
