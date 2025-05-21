class Solution {
    private boolean isSafe(int row, int col, List<String> board) {
        int dupRow = row;
        int dupCol = col;
        
        // Check upper-left diagonal
        while (dupRow >= 0 && dupCol >= 0) {
            if (board.get(dupRow).charAt(dupCol) == 'Q') return false;
            dupRow--;
            dupCol--;
        }

        // Check left side
        dupRow = row;
        dupCol = col;
        while (dupCol >= 0) {
            if (board.get(dupRow).charAt(dupCol) == 'Q') return false;
            dupCol--;
        }

        // Check lower-left diagonal
        dupRow = row;
        dupCol = col;
        while (dupRow < board.size() && dupCol >= 0) {
            if (board.get(dupRow).charAt(dupCol) == 'Q') return false;
            dupRow++;
            dupCol--;
        }

        return true;
    }

    private void help(int col, List<String> board, List<List<String>> ans) {
        if (col == board.size()) {
            ans.add(new ArrayList<>(board));
            return;
        }

        for (int row = 0; row < board.size(); row++) {
            if (isSafe(row, col, board)) {
                char[] rowArray = board.get(row).toCharArray();
                rowArray[col] = 'Q';
                board.set(row, new String(rowArray));

                help(col + 1, board, ans);

                rowArray[col] = '.';  // Backtrack
                board.set(row, new String(rowArray));
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        List<String> board = new ArrayList<>();
        String s = ".".repeat(n);
        for (int i = 0; i < n; i++) {
            board.add(s);
        }
        help(0, board, ans);
        return ans;
    }
}