package neusoft.sawyer.learn.template.cache;

/**
 * Created by sawyer on 2019-06-19.
 */
public class ModuleA {

    private String a;

    public ModuleA(String a) {
        this.a = a;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return a;
    }
}
