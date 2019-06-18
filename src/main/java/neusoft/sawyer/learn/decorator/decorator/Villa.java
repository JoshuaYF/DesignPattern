package neusoft.sawyer.learn.decorator.decorator;

import neusoft.sawyer.learn.decorator.Decorator;
import neusoft.sawyer.learn.decorator.House;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sawyer on 2019-06-18.
 */
public class Villa extends Decorator {

    public Villa(House house) {
        super(house);
    }

    @Override
    public List<String> decorator() {
        return Arrays.asList("花园", "泳池");
    }

    @Override
    public String getHouseName() {
        return "别墅";
    }
}
