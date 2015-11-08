package ua.artcode.data_structures.tree;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;

/**
 * Created by serhii on 08.11.15.
 */
public class BinarySearchTree<K, V> extends MyAbstractMap<K, V> {


    private MapTreeNode root;
    private Comparator<K> keyComparator;

    public BinarySearchTree(Comparator<K> keyComparator) {
        this.keyComparator = keyComparator;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public V get(Object key) {
        return null;
    }

    @Override
    public V put(K key, V value) {

        Entry entry = new Entry(key, value);

        if (root == null) {
            root = new MapTreeNode(entry, null, null, null);
            return null;
        }

        MapTreeNode iter = root;
        while (iter != null) {

            int compareRes = keyComparator.compare(key, iter.entry.key);

            if (compareRes < 0) {

                if (iter.lChild == null) {
                    iter.lChild = new MapTreeNode(entry, iter, null, null);
                    return null;
                } else {
                    iter = iter.lChild;
                }

            } else if (compareRes > 0) {

                if (iter.rChild == null) {
                    iter.rChild = new MapTreeNode(entry, iter, null, null);
                    return null;
                } else {
                    // repeat action
                    iter = iter.rChild;
                }

            }


        }

        return null;

    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    private class Entry {
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private class MapTreeNode {

        Entry entry;

        MapTreeNode parent;
        MapTreeNode lChild;
        MapTreeNode rChild;

        public MapTreeNode(Entry entry, MapTreeNode parent, MapTreeNode lChild, MapTreeNode rChild) {
            this.entry = entry;
            this.lChild = lChild;
            this.parent = parent;
            this.rChild = rChild;
        }
    }
}
