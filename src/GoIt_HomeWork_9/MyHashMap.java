package GoIt_HomeWork_9;

import java.util.Arrays;

public class MyHashMap<K, V> {
    Node[] nodes;
    int size;

    int count;

    MyHashMap() {
        size = 8;
        nodes = new Node[size];
    }

    static class Node<K, V> {
        K key;
        V value;
        Node next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
            next = null;
        }

        @Override
        public String toString() {
            return "node - {" +
                    "key = " + key +
                    ", value = " + value + '}';
        }
    }


    public void put(K key, V value) {
        int hashIndex = key.hashCode() % size;
        if (nodes[hashIndex] == null) {
            nodes[hashIndex] = new Node(key, value);
            count++;
        }
        Node currentValue = nodes[hashIndex];
        if (currentValue.value.equals(value)) {
        } else {
            if (currentValue.next == null) {
                currentValue.next = new Node(key, value);
                count++;
            } else
                currentValue = currentValue.next;
        }
    }

    public V get(K key) {
        Node getting = nodes[key.hashCode() % size];
        if (getting == null) {
            return null;
        }
        if (getting.key.equals(key)) {
            return (V) getting.value;
        } else {
            if (getting.next == null) {
                return null;
            } else {
                getting = getting.next;
            }
        }
        return (V) key;
    }

    public Object remove(K key) {
        Node removingNode = nodes[key.hashCode() % size];
        if (removingNode == null) {
            return null;
        }
        if (removingNode.key.equals(key)) {
            nodes[key.hashCode() % size] = removingNode.next;
            count--;
            return removingNode.value;
        }
        if (removingNode.next == null) {
            return null;
        }
        if (removingNode.next.key.equals(key)) {
            Object returningNodeValue = removingNode.next.value;
            removingNode.next = removingNode.next.next;
            removingNode.next.next = null;
            return returningNodeValue;
        } else {
            removingNode = removingNode.next;
        }
        return key;
    }


    public int size() {
        return count;
    }

    public void clear() {
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = null;
        }
        this.size = 0;
    }

    @Override
    public String toString() {
        return "MyHashMap " + Arrays.toString(nodes);
    }
}

