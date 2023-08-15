package sudoku;

public interface SudokuPuzzleType {
    int getRows();

    int getColumns();

    int getBoxWidth();

    int getBoxHeight();

    String [] getValidValues();

    String toString();
}
