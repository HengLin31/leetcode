package pers.henglin.leetcode.design;

import java.util.LinkedList;
import java.util.List;

public class ImplementTriePrefixTree {
    static final int TRIE_NODE_SIZE = 26;

    private List<Boolean> operationLog = new LinkedList<>();// log operation process
    
    private static final char CHAR_A = 'a';

    private TrieNode root;

    /** Initialize your data structure here. */
    public ImplementTriePrefixTree(){
        addLog(null);
        root = new TrieNode ();
    }

    /** Inserts a word into the trie. */
    public void insert(String word){
        addLog(null);
        TrieNode node = root;
        for(char ch:word.toCharArray()){
            if(null == node.children[index(ch)]){
                node.children [index(ch)] = new TrieNode ();
            }
            node = node.children [index(ch)];
        }
        node.isEndOfWord = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word){
        TrieNode node = root;
        for(char ch:word.toCharArray()){
            if(null == node.children[index(ch)]){
                return false;
            }
            node = node.children [index(ch)];
        }
        return node.isEndOfWord;
    }

    public boolean searchLog(String word){
        boolean result = search(word);
        addLog(result);
        return result;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix){
        TrieNode node = root;
        for(char ch:prefix.toCharArray()){
            if(null == node.children[index(ch)]){
                return false;
            }
            node = node.children[index(ch)];
        }
        return true;
    }

    public boolean startsWithLog(String word){
        boolean result = startsWith(word);
        addLog(result);
        return result;
    }

    public List<Boolean> getOperationLog() {
        return operationLog;
    }

    private int index(char ch){
        return ch - CHAR_A;
    }

    private void addLog(Boolean log){
        this.operationLog.add(log);
    }
}

class TrieNode {
    TrieNode children[];
    boolean isEndOfWord;

    TrieNode() {
        children = new TrieNode[ImplementTriePrefixTree.TRIE_NODE_SIZE];
    }
}