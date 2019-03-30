//@author Arthur Foy
//@date 3/6/2019
package textExcel;

//creates spreadsheet
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
	
	//returns a grid with whatever user entered
	public String processCommand(String command)
	{
		EmptyCell cello;
		int numCol = 0;
		int numRow = 0;
		
		//if user wants to enter value
		if(command.indexOf(" = ") != -1){
			String[] arr = command.split(" = ", 2);
			SpreadsheetLocation userInput = new SpreadsheetLocation(arr[0]);
			Cell cell;
			
			//Makes instance of different cells depending on what the user enters.
			if(arr[1].indexOf("\"") != -1) {
				cell = new TextCell(arr[1].substring(1, arr[1].length() - 1));
			}else if(arr[1].indexOf("%") != -1) {
				cell = new PercentCell(arr[1]);
			}else if(arr[1].indexOf("(") != -1){
				cell = new FormulaCell(arr[1]);
			}else {
				cell = new ValueCell(arr[1]);
			}
			sheet[userInput.getRow()][userInput.getCol()] = cell;
			return getGridText();
		}
		//user inspection
		else if(command.length() <=3) {
			SpreadsheetLocation loc = new SpreadsheetLocation(command);
			return(getCell(loc).fullCellText());
			
			//clear specific cell
		}else if(command.toUpperCase().equals("CLEAR")) {
			for(int i = 0; i < getRows(); i++) {
				for(int j = 0; j < getCols(); j++) {
					cello = new EmptyCell();
					sheet[i][j] = cello;
				}
			}
			return getGridText();
			
			//clear whole spreadsheet
		}else if(command.toUpperCase().indexOf("CLEAR ") != -1) {
			String[] arr = command.split(" ", 2);
			cello = new EmptyCell();
			SpreadsheetLocation ara = new SpreadsheetLocation(arr[1]);
			sheet[ara.getRow()][ara.getCol()] = cello;
			return getGridText();
		}else {
			return getGridText();
		}
			// TODO Auto-generated method stub	
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
		return sheet[loc.getRow()][loc.getCol()];
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
		toReturn += "\n";
		// TOD\O Auto-generated method stub
		return toReturn;
	}

}
