package Chees.Pieces;

import BoardGame.Board;
import Chees.ChessPiece;
import Chees.Color;

public class King extends ChessPiece{

	public King(Board board, Color color) {
		super(board, color);
		}
	@Override
	public String toString() {
		return "K";
	}

}
