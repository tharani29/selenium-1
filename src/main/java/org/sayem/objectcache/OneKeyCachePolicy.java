package org.sayem.objectcache;

public interface OneKeyCachePolicy<K> {
    K evictingKey(boolean cacheIsFull, K key);
}
