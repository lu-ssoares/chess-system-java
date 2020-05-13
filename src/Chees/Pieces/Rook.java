package Chees.Pieces;

import BoardGame.Board;
import Chees.ChessPiece;
import Chees.Color;

public class Rook extends ChessPiece{

	public Rook(Board board, Color color) {
		super(board, color);
		}
	@Override
	public String toString() {
		return "R";
	}

}
