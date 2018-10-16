package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Map;

public class WordSearch implements Verification<Map, Boolean> {
    private boolean wordSearch(char[][] board, String word){
        int rowLength = board.length;
        int colLength = board[0].length;

        for(int row=0; row<rowLength; row++){
            for(int col=0; col<colLength; col++){
                if(dfs(word, row, col, 0, board)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(String word, int row, int col, int index, char[][] board){
        if((row < 0) || (col < 0) || (row >= board.length) || (col >= board[0].length)){
            return false;
        }
        if(board[row][col] == word.charAt(index)){
            char temp = board[row][col];
            board[row][col] = '#';
            if(index == (word.length() - 1)){
                return true;
            }else if(
                    dfs(word,row + 1, col , index + 1, board) ||
                    dfs(word, row, col + 1 , index + 1, board) ||
                    dfs(word,row - 1, col , index + 1, board) ||
                    dfs(word, row, col - 1 , index + 1, board)){
                return true;
            }
            board[row][col] = temp;
        }
        return false;
    }

    @Override
    public Boolean verify(Map... input) {
        char[][] board = (char[][]) input[0].get("board");
        String word = (String) input[0].get("word");
        return wordSearch(board, word);
    }
}
