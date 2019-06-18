package neusoft.sawyer.learn.decorator;

import java.util.List;

/**
 * Created by sawyer on 2019-06-18.
 */
public abstract class House {

    public abstract List<String> build();

    public abstract String getHouseName();

    @Override
    public String toString() {
        return "This house name: " + getHouseName()
                + ", build need something: "
                + build();
    }
}
