package sudoku;

public class SudokuPuzzleTypeNine implements SudokuPuzzleType {
    @Override
    public int getRows() {
        int rows = 9;
        return rows;
    }

    @Override
    public int getColumns() {
        int columns = 9;
        return columns;
    }

    @Override
    public int getBoxWidth() {
        int boxWidth = 3;
        return boxWidth;
    }

    @Override
    public int getBoxHeight() {
        int boxHeight = 3;
        return boxHeight;
    }

    @Override
    public String[] getValidValues() {
        String [] validValues = new String[]  {"1","2","3","4","5","6","7","8","9"};
        return new String[0];
    }

    @Override
    public String toString() {
        String desc = "9 By 9 Game";
        return desc;
    }
}
