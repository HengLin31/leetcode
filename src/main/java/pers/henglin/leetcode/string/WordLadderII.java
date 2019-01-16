package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

import java.util.*;

public class WordLadderII implements Verification<Map, List<List<String>>> {
    private static final char A_CHAR = 'a';
    private static final char Z_CHAR = 'z';

    private List<List<String>> wordLadderII(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        wordSet.add(beginWord);
        List<List<String>> result = new ArrayList<>();
        if(!wordSet.contains(endWord)){
            return result;
        }
        List<String> paths = new ArrayList<>();
        Map<String, List<String>> graph = new HashMap<>();
        Map<String, Integer> dist = new HashMap<>();
        bfs(graph, dist, beginWord, wordSet);
        dfs(result, paths, endWord, beginWord, dist, graph);
        return result;
    }

    //adjacency list
    private void bfs(Map<String, List<String>> graph, Map<String, Integer> dist, String beginWord, Set<String> wordSet){
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        dist.put(beginWord, 0);
        for(String word:wordSet){
            graph.put(word, new ArrayList<>());
        }
        while(!queue.isEmpty()){
            String word = queue.poll();
            List<String> neighbors = getNeighbors(word, wordSet);
            for(String neighbor:neighbors){
                graph.get(neighbor).add(word);
                if(!dist.containsKey(neighbor)){
                    dist.put(neighbor, dist.get(word) + 1);
                    queue.offer(neighbor);
                }
            }
        }
    }

    public void dfs(List<List<String>> result, List<String> paths, String word, String beginWord, Map<String, Integer> dist, Map<String, List<String>> graph) {
        if(word.equals(beginWord)){
            paths.add(0, word);
            result.add(new ArrayList<>(paths));
            paths.remove(0);
            return;
        }
        for(String neighbor: graph.get(word)){
            if(dist.containsKey(neighbor) && (dist.get(word) == (dist.get(neighbor) + 1))){
                paths.add(0, word);
                dfs(result, paths, neighbor, beginWord, dist, graph);
                paths.remove(0);
            }
        }
    }

    private List<String> getNeighbors(String word, Set<String> wordSet){
        List<String> result = new ArrayList<>();
        if(null == word){
            return result;
        }
        for(int index=0; index<word.length(); index++) {
            for(char ch=A_CHAR; ch<Z_CHAR+1; ch++){
                char[] chs = word.toCharArray();
                if(ch != chs[index]){
                    chs[index] = ch;
                    String next = new String(chs);
                    if(wordSet.contains(next)){
                        result.add(next);
                    }
                }
            }
        }
        return result;
    }

    @Override
    public List<List<String>> verify(Map... input) {
        String beginWord = input[0].get("beginWord").toString();
        String endWord = input[0].get("endWord").toString();
        List<String> wordList = (List<String>) input[0].get("wordList");
        return wordLadderII(beginWord, endWord, wordList);
    }
}
