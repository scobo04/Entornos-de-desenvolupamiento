package sudoku;

public class SudokuFactory {
    public SudokuPuzzleType getSudoku(int type) {
        switch (type) {
            case 6: return new SudokuPuzzleTypeSix();
            //case
            default: return new SudokuPuzzleTypeNine();
        }
    }
}
