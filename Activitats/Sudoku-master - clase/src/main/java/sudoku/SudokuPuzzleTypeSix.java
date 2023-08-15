package sudoku;

public class SudokuPuzzleTypeSix implements SudokuPuzzleType {

    private final String [] validValues = new String[] {"1","2","3","4","5","6"};
    private final String desc = "6 By 6 Game";

    @Override
    public int getRows() {
        int rows = 6;
        return rows;
    }

    @Override
    public int getColumns() {
        int columns = 6;
        return columns;
    }

    @Override
    public int getBoxWidth() {
        int boxWidth = 3;
        return boxWidth;
    }

    @Override
    public int getBoxHeight() {
        int boxHeight = 2;
        return boxHeight;
    }

    @Override
    public String[] getValidValues() {
        String [] validValues = new String[] {"1","2","3","4","5","6"};
        return new String[0];
    }

    @Override
    public String toString() {
        String desc = "6 By 6 Game";
        return desc;
    }
}
