//package dm550.tictactoe;

public class XYCoordinate implements Coordinate {

    /** variables specifying horizontal position on the board */
    private int x;

    /** variable specifying vertical positoin on the board */
    private int y;

    /** constructor creating a Coordinate from x and y values */
    public XYCoordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public boolean checkBoundaries(int xSize, int ySize) {
        // TODO
        return (x>=0 && x<=xSize-1) && (y>=0 && y<=ySize-1);
    }

    @Override
    public Coordinate shift(int dx, int dy) {
        // TODO
        return new XYCoordinate(x+dx,y+dy);
    }

}
