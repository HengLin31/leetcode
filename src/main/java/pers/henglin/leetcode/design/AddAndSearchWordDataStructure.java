package pers.henglin.leetcode.design;

import java.util.LinkedList;
import java.util.List;

public class AddAndSearchWordDataStructure {
    private static final int TRIE_NODE_SIZE = 26;
    private static final char CHAR_SPACE = ' ';
    private static final char CHAR_A = 'a';
    private static final char CHAR_ANY = '.';

    private List<Boolean> operationLog = new LinkedList<>();// log operation process

    private Node root;

    /** Initialize your data structure here. */
    public AddAndSearchWordDataStructure(){
        addLog(null);
        this.root = new Node(CHAR_SPACE);
    }

    /** Adds a word into the data structure. */
    public void addWord(String word){
        addLog(null);
        if((null == word) || (0 == word.length())){
            return;
        }
        Node node = root;
        for(char ch:word.toCharArray()){
            if(null == node.children[index(ch)]){
                node.children[index(ch)] = new Node(ch);
            }
            node = node.children[index(ch)];
        }
        node.isEnd = true;
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word){
        boolean result = find(root, word, 0);
        addLog(result);
        return result;
    }

    public List<Boolean> getOperationLog() {
        return operationLog;
    }

    private boolean find(Node node, String word, int index){
        if((null == word) || (0 == word.length())){
            return false;
        }
        for(int charIndex=index; charIndex<word.length(); charIndex++){
            if(CHAR_ANY == word.charAt(charIndex)){
                for(Node next:node.children){
                    if(null == next){
                        continue;
                    }
                    if(find(next, word, charIndex + 1)){
                        return true;
                    }
                }
                return false;
            }else if(null != node.children[index(word.charAt(charIndex))]){
                node = node.children[index(word.charAt(charIndex))];
            }else{
                return false;
            }
        }
        return node.isEnd;
    }

    private int index(char ch){
        return ch - CHAR_A;
    }

    private void addLog(Boolean log){
        this.operationLog.add(log);
    }

    private class Node{
        private char data;
        private Node[] children;
        private boolean isEnd;

        Node(char data){
            this.data = data;
            this.children = new Node[TRIE_NODE_SIZE];
            this.isEnd = false;
        }
    }
}
