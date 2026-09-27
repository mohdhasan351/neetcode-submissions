class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Integer> [] row = new HashSet[9];
        HashSet<Integer> [] col = new HashSet[9];
        HashSet<Integer> [] box = new HashSet[9];
        for(int i=0;i<9;i++){
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }
        
        for(int i=0;i<board.length;i++){//row
            for(int j=0;j<board[i].length;j++){ //column
                if(board[i][j]=='.') continue;
                if(!row[i].add(board[i][j]-'0'))
                    return false;
                if(!col[j].add(board[i][j]-'0'))
                    return false;
                int k = (i / 3) * 3 + (j / 3);
                if(!box[k].add(board[i][j]-'0'))
                    return false;
            }
        }
        return true;
    }
}
