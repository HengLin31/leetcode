package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WordSearchII implements Verification<Map, List<String>> {
    private static final int NODE_SIZE = 26;
    private static final char CHAR_A = 'a';
    private static final char CHAR_ALREADY_VISITED = '*';

    private List<String> wordSearchII(char[][] board, String[] words){
        Node root = new Node();
        for(String word:words){
            insertWord(root, word);
        }
        List<String> result = new ArrayList<>();
        for(int row=0; row<board.length; row++){
            for(int col=0; col<board[0].length; col++){
                dfs(board, row, col, root, result);
            }
        }
        return result;
    }

    @Override
    public List<String> verify(Map... input){
        char[][] board = (char[][]) input[0].get("board");
        String[] words = (String[]) input[0].get("words");
        return wordSearchII(board, words);
    }

    private void dfs(char[][] board, int row, int col, Node node, List<String> result){
        if((row < 0) || (row >= board.length) || (col < 0) || (col >= board[0].length)){
            return;
        }
        if(CHAR_ALREADY_VISITED == board[row][col]){
            return;
        }
        if(null == node.children[index(board[row][col])]){
            return;
        }
        node = node.children[index(board[row][col])];
        if(null != node.word){
            result.add(node.word);
            node.word = null;
        }
        char temp = board[row][col];
        board[row][col] = CHAR_ALREADY_VISITED;

        dfs(board, row - 1, col, node, result);
        dfs(board, row + 1, col, node, result);
        dfs(board, row, col - 1, node, result);
        dfs(board, row, col + 1, node, result);

        board[row][col] = temp;
    }

    private void insertWord(Node root, String word) {
        for(char ch:word.toCharArray()){
            if(null == root.children[index(ch)]){
                root.children[index(ch)] = new Node();
            }
            root = root.children[index(ch)];
        }
        root.word = word;
    }

    private int index(char ch){
        return ch - CHAR_A;
    }

    private class Node {
        private Node[] children = new Node[NODE_SIZE];
        private String word;
    }
}
