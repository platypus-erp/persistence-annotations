package org.platypus.framework.utils;

import java.util.Map;
import java.util.Optional;
import java.util.WeakHashMap;
import java.util.stream.Collectors;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public class BiMap<K,V> {

    private final Map<K,V> keyValue;
    private final Map<V,K> valueKey;

    public BiMap(){
        keyValue = new WeakHashMap<>();
        valueKey = new WeakHashMap<>();
    }

    public BiMap(int size){
        keyValue = new WeakHashMap<>(size);
        valueKey = new WeakHashMap<>(size);
    }

    public BiMap(final Map<K,V> keyValue){
        this.keyValue = new WeakHashMap<>(keyValue);
        this.valueKey = keyValue.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey,(k1,k2) -> k1 ,WeakHashMap::new));
    }


    public V putKeyValue(K key, V value){
        this.valueKey.put(value, key);
        return this.keyValue.put(key, value);
    }

    public K putValueKey(V key, K value){
        this.keyValue.put(value, key);
        return this.valueKey.put(key, value);
    }

    public boolean containsKey(K key){
        return keyValue.containsKey(key);
    }

    public boolean containsValue(V value){
        return valueKey.containsKey(value);
    }

    public Optional<V> getFromKey(K key){
        return Optional.ofNullable(keyValue.get(key));
    }

    public Optional<K> getFromValue(V value){
        return Optional.ofNullable(valueKey.get(value));
    }

    public V getFromKeyOrDefault(K key, V defaultValue){
        return keyValue.getOrDefault(key, defaultValue);
    }

    public K getFromValueOrDefault(V value, K defaultValue){
        return valueKey.getOrDefault(value, defaultValue);
    }

}
