package ua.artcode.data_structures.tree;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;

/**
 * Created by serhii on 08.11.15.
 */
public class BinarySearchTreeMap<K, V> extends MyAbstractMap<K, V> {


    private MapTreeNode root;
    private Comparator<K> keyComparator;

    public BinarySearchTreeMap(Comparator<K> keyComparator) {
        this.keyComparator = keyComparator;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return root != null;
    }

    @Override
    public boolean containsKey(Object key) {
        return find((K)key, root) != null;
    }

    /**
     *
     *
     * @throws CastClassException if key input other type
     * */
    @Override
    public V get(Object key) {

        MapTreeNode found = find((K)key, root);

        return found != null ? found.entry.value : null;
    }

    private MapTreeNode find(K key, MapTreeNode curr){

        if(curr == null){
            return null;
        }

        int compareRes = keyComparator.compare(key, curr.entry.key);

        if(compareRes < 0){
            return find(key, curr.lChild);
        } else if(compareRes > 0){
            return find(key, curr.rChild);
        } else {
            return curr;
        }

        //return compareRes == 0 ? curr : compareRes < 0 ? find(key, curr.lChild) : find(key,curr.rChild);

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

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Entry{");
            sb.append("key=").append(key);
            sb.append(", value=").append(value);
            sb.append('}');
            return sb.toString();
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

    public String toString(MapTreeNode curr){

        if(curr == null){
            return "";
        }


        return toString(curr.lChild) + curr.entry + toString(curr.rChild);

    }

    @Override
    public String toString() {
        return toString(root);
    }
}
