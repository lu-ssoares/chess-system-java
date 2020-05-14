package Application;

import java.util.Scanner;

import Chees.ChessMatch;
import Chees.ChessPiece;
import Chees.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ChessMatch chessmatch = new ChessMatch();
		
		while(true) {
					
		UI.PrintBoard(chessmatch.getPieces());
		System.out.println();
		System.out.print("Source: ");
		ChessPosition source = UI.readChessPosition(sc);
		
		System.out.println();
		System.out.print("Target: ");
		ChessPosition target = UI.readChessPosition(sc);
		
		ChessPiece capturedPiece = chessmatch.performChesMove(source, target);
		
		}
			
	}

}
