package neusoft.sawyer.learn.decorator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sawyer on 2019-06-18.
 */
public abstract class Decorator extends House {

    private House house;

    public Decorator(House house) {
        this.house = house;
    }

    public abstract List<String> decorator();

    @Override
    public List<String> build() {
        List<String> build = new ArrayList<>(house.build());
        build.addAll(decorator());
        return build;
    }
}
