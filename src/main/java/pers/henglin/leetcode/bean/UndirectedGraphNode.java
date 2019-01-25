package pers.henglin.leetcode.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UndirectedGraphNode {
    private static final int NO_VALUE = -999;

    public int label;
    public List<UndirectedGraphNode> neighbors;

    public UndirectedGraphNode(int x){
        this.label = x;
        this.neighbors = new ArrayList<>();
    }

    public static UndirectedGraphNode init(Integer[] datas){
        if((null == datas) || (0 == datas.length)){
            return new UndirectedGraphNode(NO_VALUE);
        }
        Map<Integer, UndirectedGraphNode> mappingNodes = new HashMap<>();
        boolean isLabel = true;
        int currentLabel = NO_VALUE;
        for(int index=0; index<datas.length; index++){
            if((null != datas[index]) && !mappingNodes.containsKey(datas[index])){
                mappingNodes.put(datas[index], new UndirectedGraphNode(datas[index]));
            }
            if(null == datas[index] || 0 == index){
                isLabel = true;
                continue;
            }
            if(isLabel){
                currentLabel = datas[index];
            }else{
                UndirectedGraphNode neighbor = mappingNodes.get(datas[index]);
                mappingNodes.get(currentLabel).neighbors.add(neighbor);
            }
            isLabel = false;
        }
        return mappingNodes.get(datas[0]);
    }

    public static boolean isSame(UndirectedGraphNode node1, UndirectedGraphNode node2){
        if((null == node1) && (null == node2)){
            return true;
        }
        if((null != node1) && (null != node2) && (node1.label != node2.label)){
            return false;
        }
        if((null == node1) || (null == node2)){
            return false;
        }
        if(node1.neighbors.size() != node2.neighbors.size()){
            return false;
        }
        for(int index=0; index<node1.neighbors.size(); index++){
            if(!isSame(node1.neighbors.get(index), node2.neighbors.get(index))){
                return false;
            }
        }
        return true;
    }
}
