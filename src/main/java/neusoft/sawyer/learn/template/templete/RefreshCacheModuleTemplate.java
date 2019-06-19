package neusoft.sawyer.learn.template.templete;

import neusoft.sawyer.learn.template.CacheService;
import neusoft.sawyer.learn.template.cache.Cache;

/**
 * Created by sawyer on 2019-06-19.
 */
public abstract class RefreshCacheModuleTemplate {

    private CacheService cacheService;

    public RefreshCacheModuleTemplate() {
        cacheService = new CacheService();
    }

    public void refreshCache(String key) {
        Cache cache = cacheService.getCacheValue(key);
        refreshModule(cache);
        cacheService.putCache(key, cache);
    }

    protected abstract void refreshModule(Cache cache);
}
