import java.util.Random;

public class Main {

	public static int N = 4;
	public static char[][] board = new char[N][N];
	
	public Queen[] createBestSuccessor(Queen[] queenArray){
		for(int column=0; column<N-1; column++){
			int conflict = 100;
			int tempConflict=0;
			
			for(int row=0; row<N; row++){
				Queen q = new Queen(row, column);
				for(int nextQueen = column+1; nextQueen<N; nextQueen++){
					if(q.checkConflict(queenArray[nextQueen]))
						tempConflict ++;
				}
				for(int k=column+1;k<N-1;k++){
					for(int l=k+1;l<N;l++)
						if(queenArray[k].checkConflict(queenArray[l]))
							tempConflict ++;
				}
				if(tempConflict < conflict){
					conflict = tempConflict;
					queenArray[column] = q;
				}
				tempConflict=0;
			}
		}
		return queenArray;
	}
	
	
	public boolean checkAnyConflict(Queen[] queenArray){
		for(int i=0; i<N; i++){
			Queen q = queenArray[i];
			for(int nextQueen=i+1; nextQueen<N; nextQueen++){
				if(q.checkConflict(queenArray[nextQueen]))
					return false;		//there is conflict
			}
		}
		return true;
	}
	
	public void placeQueenToBoard(Queen[] queenArray){
		for(int i=0; i<N; i++){
			board[queenArray[i].getRow()][queenArray[i].getColumn()] = 'Q';
		}
	}
	
	public void genarateRandomQueen(Queen[] queenArray){
		Random rand = new Random();
		for(int y=0; y<N; y++){
			int x = rand.nextInt(N);
			Queen queen = new Queen(x,y);
			queenArray[y] = queen;
		}
	}
	
	public void clearBoard(){
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++)
				board[i][j] = '#';
		}
	}
	
	public void printBoard(){
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++)
				System.out.print(board[i][j]+"  ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Queen [] queenArray = new Queen[N];		//blank queen array
		
		Main m = new Main();	
		m.clearBoard();		//placing . to the whole board
		m.genarateRandomQueen(queenArray);		//assigning random value to queen array
		m.placeQueenToBoard(queenArray);		//printing Q where there is queen
		System.out.println("Initially state: ");
		m.printBoard();		//printing the board
		System.out.println('\n');

		while(true){
			queenArray = m.createBestSuccessor(queenArray);
			if(m.checkAnyConflict(queenArray))		//checking if there is any conflict, return false if there is any conflict
				break;
			m.genarateRandomQueen(queenArray);		//again assigning random value to queen array
		}
		
		m.clearBoard();		//placing . to the whole board
		m.placeQueenToBoard(queenArray);	//printing Q where there is queen
		System.out.println("Final state: ");
		m.printBoard();		//printing the board
	}
}