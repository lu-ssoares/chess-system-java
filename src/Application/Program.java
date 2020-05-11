package Application;

import Chees.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessmatch = new ChessMatch();
		UI.PrintBoard(chessmatch.getPieces());
	
	}

}
