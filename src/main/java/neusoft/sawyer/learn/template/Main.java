package neusoft.sawyer.learn.template;

import neusoft.sawyer.learn.template.cache.Cache;

/**
 * Created by sawyer on 2019-06-19.
 */
public class Main {

    public static void main(String[] args) {
        CacheService cacheService = new CacheService();
        String key1 = "TEST1";
        cacheService.putCache(key1, new Cache("A", "B"));
        cacheService.refresh(key1);
        System.out.println(cacheService.getCacheValue(key1));
    }
}
