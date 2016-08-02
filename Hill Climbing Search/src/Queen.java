public class Queen {

	private int row;
	private int column;

	public Queen(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public boolean checkConflict(Queen q) {
		// test rows and columns
		if (this.row == q.getRow() || this.column == q.getColumn())
			return true;
		// test diagonal
		else if (Math.abs(this.column - q.getColumn()) == Math.abs(this.row - q.getRow()))
			return true;
		
		else
			return false;
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}
}