package pers.henglin.leetcode.design;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LRUCache {
    private static final Integer NULL = null;
    private static final Integer DOES_NOT_EXIST = -1;

    private List<Integer> operationLog = new LinkedList<>();// log operation process

    private LRUMap<Integer, Integer> map;

    public LRUCache(int capacity) {
        this.map = new LRUMap<>(capacity);
    }

    public int get(int key) {
        if(!this.map.containsKey(key)){
            this.operationLog.add(DOES_NOT_EXIST);
            return DOES_NOT_EXIST;
        }
        this.operationLog.add(key);
        return map.get(key);
    }

    public void put(int key, int value) {
        this.operationLog.add(NULL);
        this.map.put(key, value);
}

    public List<Integer> getOperationLog(){
        return operationLog;
    }

    class LRUMap<K, V> extends LinkedHashMap<K, V>{
        private int capacity;

        private LRUMap(int initCapacity){
            super(initCapacity, 0.75f, true);
            this.capacity = initCapacity;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            //return super.removeEldestEntry(eldest);
            return this.size() > this.capacity;
        }
    }
}
