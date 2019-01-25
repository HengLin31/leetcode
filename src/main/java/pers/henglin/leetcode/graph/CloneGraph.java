package pers.henglin.leetcode.graph;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.UndirectedGraphNode;

import java.util.HashMap;
import java.util.Map;

public class CloneGraph implements Verification<UndirectedGraphNode, UndirectedGraphNode> {
    private Map<Integer, UndirectedGraphNode> visited = new HashMap<>();

    private UndirectedGraphNode cloneGraph(UndirectedGraphNode node){
        if(null == node){
            return node;
        }
        if(visited.containsKey(node.label)){
            return visited.get(node.label);
        }
        UndirectedGraphNode clone = new UndirectedGraphNode(node.label);
        visited.put(clone.label, clone);
        for(UndirectedGraphNode neighbor:node.neighbors){
            clone.neighbors.add(cloneGraph(neighbor));
        }
        return clone;
    }

    @Override
    public UndirectedGraphNode verify(UndirectedGraphNode... input) {
        return cloneGraph(input[0]);
    }
}
