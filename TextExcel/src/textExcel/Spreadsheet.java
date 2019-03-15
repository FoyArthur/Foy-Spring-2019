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
		char letter = 65;
		int number = 1;
		String toReturn = "";
		toReturn += ("   |");
		for(int i = 0; i < getCols(); i++) {
			toReturn += letter + "         |";
			letter += 1;
		}
		for(int k = 0; k < getRows(); k++) {
			if(k < 9) {
				toReturn += "\n" + (k + 1) + "  |";
			}else {
				toReturn += "\n" + (k + 1) + " |";
			}
			for(int j = 0; j < getCols(); j++) {
				if(j == 0 && k == 0) {
					toReturn += "hello     |";
				}
				toReturn += "          |";
			}
		}
		// TOD\O Auto-generated method stub
		return toReturn;
	}

}
