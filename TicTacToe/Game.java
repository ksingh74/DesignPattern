public class Game {
    private Board board;
    private Player player;

    public void makeMove(Player player, int i, int j) {
        Integer[][] boardMatrix = board.getBoardMatrix();
        if (!checkValidMove(i, j))
            return;
        boardMatrix[i][j] = player.getChoiceOfXO();
        Boolean hasPlayerWon = checkIfPlayerHasWon();

    }

    private Boolean checkValidMove(int i, int j) {
        if (board.getBoardMatrix()[i][j] != -1) {
            System.out.println("Invalid move");
            return Boolean.FALSE;
        }
        return Boolean.TRUE
    }

    private Boolean checkIfPlayerHasWon() {
        Integer[][] boardMatrix = board.getBoardMatrix();
        // write logic
        return false;
    }
}
