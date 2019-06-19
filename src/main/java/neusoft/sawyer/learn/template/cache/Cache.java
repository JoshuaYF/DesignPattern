package neusoft.sawyer.learn.template.cache;

/**
 * Created by sawyer on 2019-06-19.
 */
public class Cache {

    private ModuleA moduleA;

    private ModuleB moduleB;

    public Cache(String a, String b) {
        this.moduleA = new ModuleA(a);
        this.moduleB = new ModuleB(b);
    }

    public ModuleA getModuleA() {
        return moduleA;
    }

    public void setModuleA(ModuleA moduleA) {
        this.moduleA = moduleA;
    }

    public ModuleB getModuleB() {
        return moduleB;
    }

    public void setModuleB(ModuleB moduleB) {
        this.moduleB = moduleB;
    }

    @Override
    public String toString() {
        return String.format("ModuleA.a = %s, ModuleB.b = %s", moduleA.getA(), moduleB.getB());
    }
}
