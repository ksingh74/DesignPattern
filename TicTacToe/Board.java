public class Board {
    private Integer[][] boardMatrix;

    public Board() {
        boardMatrix = new Integer[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boardMatrix[i][j] = -1;
            }
        }
    }

    public Integer[][] getBoardMatrix() {
        return boardMatrix;
    }
}
