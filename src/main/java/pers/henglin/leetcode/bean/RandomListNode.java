package pers.henglin.leetcode.bean;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomListNode {
    private static final Random RANDOM = new Random();

    public int label;
    public RandomListNode next;
    public RandomListNode random;

    public RandomListNode(int x){
        this.label = x;
    }

    public static RandomListNode init(int[] array){
        if(array.length == 0){
            return null;
        }

        Map<Integer, RandomListNode> map = new HashMap<>();
        RandomListNode headNode = new RandomListNode(array[0]);
        RandomListNode currentNode = headNode;
        map.put(0, currentNode);
        for(int index=1; index<array.length; index++){
            RandomListNode nextNode = new RandomListNode(array[index]);
            currentNode.next = nextNode;
            currentNode = nextNode;
            map.put(index, nextNode);
        }

        currentNode = headNode;
        while(null != currentNode){
            currentNode.random = map.get(RANDOM.nextInt(array.length));
            currentNode = currentNode.next;
        }

        return headNode;
    }

    public static boolean isSame(RandomListNode node1, RandomListNode node2){
        if((null == node1) && (null == node2)){
            return true;
        }
        while((null != node1) && (null != node2)){
            if(node1.label != node2.label){
                return false;
            }
            if(node1.random.label != node2.random.label){
                return false;
            }
            node1 = node1.next;
            node2 = node2.next;
        }
        return true;
    }
}
