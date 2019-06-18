package neusoft.sawyer.learn.decorator.decorator;

import neusoft.sawyer.learn.decorator.Decorator;
import neusoft.sawyer.learn.decorator.House;

import java.util.Collections;
import java.util.List;

/**
 * Created by sawyer on 2019-06-18.
 */
public class HighHouse extends Decorator {

    public HighHouse(House house) {
        super(house);
    }

    @Override
    public List<String> decorator() {
        return Collections.singletonList("避雷针");
    }

    @Override
    public String getHouseName() {
        return "高楼";
    }
}
