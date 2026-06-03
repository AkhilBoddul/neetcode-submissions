class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> rowSet = new HashSet<>();
        Set<Character> columnSet = new HashSet<>();
        Set<Character> leftBoxSet = new HashSet<>();
        Set<Character> middleBoxSet = new HashSet<>();
        Set<Character> rightBoxSet = new HashSet<>();
        int posCount = 0;

        for (int i = 0; i < board.length; i++) {
            if (i > 0 && i % 3 == 0) {
                leftBoxSet.clear();
                middleBoxSet.clear();
                rightBoxSet.clear();
            }
            for (int j = 0; j < board[0].length; j++) {
                if (board[j][i] != '.' && !columnSet.add(board[j][i]))
                    return false;
                if (board[i][j] != '.' && !rowSet.add(board[i][j]))
                    return false;

                posCount = j / 3;

                if ((posCount == 0 && board[i][j] != '.' && !leftBoxSet.add(board[i][j]))
                    || (posCount == 1 && board[i][j] != '.' && !middleBoxSet.add(board[i][j]))
                    || (posCount == 2 && board[i][j] != '.' && !rightBoxSet.add(board[i][j])))
                    return false;
            }
            rowSet.clear();
            columnSet.clear();
        }

        return true;
    }
}
