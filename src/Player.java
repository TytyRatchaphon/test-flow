public class Player {

    private String name;
    private Piece piece;
    private Board board;
    private Die dice;

    public Player(String name, Piece piece, Board board, Die dice) {
        this.setName(name);
        this.piece = piece;
        this.board = board;
        this.dice = dice;
    }

    public void takeTurn() {
        // code..
        // System.out.println(oldLoc);
        // System.out.println(newLoc);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
