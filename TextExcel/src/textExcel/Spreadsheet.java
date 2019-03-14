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
		System.out.print("   |");
		for(int i = 0; i < 12; i++) {
			System.out.print(letter + "         |" );
			letter += 1;
		}
		for(int k = 1; k < 21; k++) {
			if(k < 10) {
				System.out.print("\n" + k + "  |");
			}else {
				System.out.print("\n" + k + " |");
			}
			for(int j = 0; j < 12; j++) {
				System.out.print("          |");
			}
		}
		// TOD\O Auto-generated method stub
		return null;
	}

}
