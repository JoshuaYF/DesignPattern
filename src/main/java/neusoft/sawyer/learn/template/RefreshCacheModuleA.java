package neusoft.sawyer.learn.template;

import neusoft.sawyer.learn.template.cache.Cache;

/**
 * Created by sawyer on 2019-06-19.
 */
public class RefreshCacheModuleA extends RefreshCacheModuleTemplate {

    @Override
    public void refreshModule(Cache cache) {
        cache.getModuleA().setA("ModuleA对象被RefreshCacheModuleA改为了B");
    }
}
