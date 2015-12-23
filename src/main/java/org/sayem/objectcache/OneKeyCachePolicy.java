package org.sayem.objectcache;

/**
 * Created by sayem on 12/4/15.
 */
public interface OneKeyCachePolicy<K> {
    K evictingKey(boolean cacheIsFull, K key);
}
