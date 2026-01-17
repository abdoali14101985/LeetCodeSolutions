package com.abdoa.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCache {
    private int capacity;
    private Map<Integer, ListNodeLRU> cache;
    private LinkedList<ListNodeLRU> lruList;

    public class ListNodeLRU{
        private int key;
        private int value;
        public ListNodeLRU(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    public LRUCache(int capacity){
        this.capacity = capacity;
        cache = new HashMap<>(capacity);
        lruList = new LinkedList<>();
    }

    public int get(int key){
        if(cache.containsKey(key)){
            ListNodeLRU getNode = cache.get(key);
            lruList.remove(getNode);
            lruList.addFirst(getNode);
            return getNode.value;
        }
        return -1;
    }

    public void put(int key, int value){
        ListNodeLRU putNode = new ListNodeLRU(key, value);
        if(cache.containsKey(key)){
            ListNodeLRU removeNode = cache.get(key);
            cache.put(key, putNode);
            lruList.remove(removeNode);
            lruList.addFirst(putNode);

        }else{
            if(cache.size() >= capacity){
                ListNodeLRU removeNode = lruList.removeLast();
                lruList.addFirst(putNode);
                cache.remove(removeNode.key);
                cache.put(key, putNode);
            }else{
                cache.put(key, putNode);
                lruList.addFirst(putNode);
            }
        }
    }
}
