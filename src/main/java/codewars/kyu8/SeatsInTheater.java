package codewars.kyu8;

public class SeatsInTheater {
    
    public static int seatsInTheater(int nCols, int nRows, int col, int row) {
        int countOfPeople = 0;
    
        for (int i = col; i <= nCols; i++) {
            countOfPeople += nRows - row;
        }
        
        return countOfPeople;
    }
    
}