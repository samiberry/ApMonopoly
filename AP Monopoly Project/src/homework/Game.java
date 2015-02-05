package homework;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Board board;

    public Game(Board monopoly) {
        this.board = monopoly;

    }

    public void play() {
        // ask for number of players and their PlayerPiece
        // buildPlayers();
    }

    private void buildPlayers(int count, PlayerPiece playerPiece) {
        // create list of players and their values
        for (int aa = 0; aa< count; aa++) {
            board.addNewPlayer(null);
        }
    }

    private void promptUsers() {
        List<PlayerPiece> pieces = new ArrayList<PlayerPiece>();
        for (PlayerPiece piece: PlayerPiece.values()) {
            pieces.add(piece);
        }

        // prompt for number of players

        // for number of players:

            // prompt user for name

            // prompt user to select piece then remove from pieces list
            // buildPlayers(0, null);
    }
}
