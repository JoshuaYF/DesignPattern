package neusoft.sawyer.learn.template.cache;

/**
 * Created by sawyer on 2019-06-19.
 */
public class ModuleB {

    private String b;

    public ModuleB(String b) {
        this.b = b;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return b;
    }
}
