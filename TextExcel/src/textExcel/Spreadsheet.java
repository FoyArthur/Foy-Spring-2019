//@author Arthur Foy
//3/6/2019
package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private int rows;
	private int cols;
	TextCell cells;
	private Cell[][] sheet;
	
	public Spreadsheet() {
		rows = 20;
		cols = 12;
		sheet = new Cell[rows][cols];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				sheet[i][j] = new EmptyCell();
			}
		}
	}
	@Override
	public String processCommand(String command)
	{
	
		int numCol = 0;
		int numRow = 0;
		if(command.indexOf(" ") != -1){
			String[] arr = command.split(" = ", 2);
			SpreadsheetLocation userInput = new SpreadsheetLocation(arr[0]);
			TextCell cell = new TextCell(arr[1]);
			System.out.println(arr[1]);
			sheet[userInput.getRow()][userInput.getCol()] = cell;
		}else if(command.length() == 2) {
			SpreadsheetLocation com = new SpreadsheetLocation(command);
			return(sheet[com.getRow()][com.getCol()] + "");
		}
		
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
				toReturn += sheet[k][j].abbreviatedCellText() + "|";
			}
		}
		// TOD\O Auto-generated method stub
		return toReturn;
	}

}
