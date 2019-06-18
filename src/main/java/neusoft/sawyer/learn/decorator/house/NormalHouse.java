package neusoft.sawyer.learn.decorator.house;

import neusoft.sawyer.learn.decorator.House;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sawyer on 2019-06-18.
 */
public class NormalHouse extends House {

    @Override
    public List<String> build() {
        return Arrays.asList("钢筋", "水泥", "石头", "木头", "瓦片");
    }

    @Override
    public String getHouseName() {
        return "普通房屋";
    }
}
