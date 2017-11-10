class checkers{
	public static void main(String[] args) {
		String [] board = new String [7];
		board[0] = ".......";
		board[1] = ".....X.";
		board[2] = ".......";
		board[3] = ".....X.";
		board[4] = ".......";
		board[5] = "...X...";
		board[6] = "..O....";
		int validMoves = countMoves(board);
		System.out.println("Valid Moves: " + validMoves);
	}

	static int countMoves(String [] B){
		int validMoves = 0;
		int whiteX = 0;
		int whiteY = 0;
		int blackX = 0;
		int blackY = 0;
		int blankX = 0;
		int blankY = 0;
		String possibleBlack = "";
		String possibleBlank = "";
		boolean finishedBoard = false;

		//Find the Position of the 'O' character
		for(int i = 0; i < B.length; i++){
			if(B[i].contains("O")){
				whiteX = B[i].indexOf("O");
				whiteY = i;
				System.out.println("whiteX(" + whiteX + ") : whiteY(" + whiteY + ")");
			}
		}

		while(!finishedBoard){
			//Check if Postion on the left
			blackX = whiteX-1;
			blackY = whiteY-1;
			if(blackX > 0 && blackY > 0){
				System.out.println("LEFT:: blackX(" + blackX + ") : blackY(" + blackY + ")");
				possibleBlack = Character.toString(B[blackY].charAt(blackX));
				if(possibleBlack.equals("X")){
					System.out.println("BLack Pawn at (" + blackX + ", " + blackY + ")");
					//Check the next position to jump to
					blankX = blackX-1;
					blankY = blackY-1;
					possibleBlank = Character.toString(B[blankY].charAt(blankX));
					if(possibleBlank.equals(".")){
						System.out.println("Valid Jump Detected");
						validMoves++;
						whiteX = blankX;
						whiteY = blankY;
						System.out.println("White now at (" + whiteX + ", " + whiteY + ")");
						continue;
					}
				}
			}

			//Check Position on the right
			blackX = whiteX+1;
			blackY = whiteY-1;
			if(blackY > 0 && blackX < B[blackY].length()-1){
				System.out.println("RIGHT:: blackX(" + blackX + ") : blackY(" + blackY + ")");
				possibleBlack = Character.toString(B[blackY].charAt(blackX));
				if(possibleBlack.equals("X")){
					System.out.println("BLack Pawn at (" + blackX + ", " + blackY + ")");
					//Check the next position to jump to
					blankX = blackX+1;
					blankY = blackY-1;
					possibleBlank = Character.toString(B[blankY].charAt(blankX));
					if(possibleBlank.equals(".")){
						System.out.println("Valid Jump Detected");
						validMoves++;
						whiteX = blankX;
						whiteY = blankY;
						System.out.println("White now at (" + whiteX + ", " + whiteY + ")");
						continue;
					}
				}
			}
			break;
		}
		return validMoves;
	}
}
