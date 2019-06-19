package neusoft.sawyer.learn.template;

import neusoft.sawyer.learn.template.cache.Cache;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sawyer on 2019-06-19.
 */
public class CacheService {

    private static final ThreadLocal<Map<String, Cache>> threadLocal = new ThreadLocal<>();

    static {
        threadLocal.set(new HashMap<>());
    }

    public void refresh(String key) {
        RefreshCacheModuleTemplate refreshCacheModuleA = new RefreshCacheModuleA();
        refreshCacheModuleA.refreshCache(key);
        RefreshCacheModuleTemplate refreshCacheModuleB = new RefreshCacheModuleB();
        refreshCacheModuleB.refreshCache(key);
    }

    public void putCache(String key, Cache cache) {
        threadLocal.get().put(key, cache);
    }

    public Cache getCacheValue(String key) {
        return threadLocal.get().get(key);
    }
}
