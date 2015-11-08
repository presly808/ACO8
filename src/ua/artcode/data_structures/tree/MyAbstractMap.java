package ua.artcode.data_structures.tree;


import java.util.Map;
import java.util.Set;

public abstract class MyAbstractMap<K,V> implements Map<K,V> {

    @Override
    public void clear() {
        throw new NoSuchMethodError();
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        throw new NoSuchMethodError();
    }

    @Override
    public boolean containsValue(Object value) {
        throw new NoSuchMethodError();
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        throw new NoSuchMethodError();
    }

    @Override
    public V remove(Object key) {
        throw new NoSuchMethodError();
    }
}
