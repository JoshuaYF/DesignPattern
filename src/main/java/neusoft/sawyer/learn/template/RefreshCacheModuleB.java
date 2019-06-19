package neusoft.sawyer.learn.template;

import neusoft.sawyer.learn.template.cache.Cache;

/**
 * Created by sawyer on 2019-06-19.
 */
public class RefreshCacheModuleB extends RefreshCacheModuleTemplate {

    @Override
    public void refreshModule(Cache cache) {
        cache.getModuleB().setB("ModuleB对象被RefreshCacheModuleB改为了A");
    }
}
