package neusoft.sawyer.learn.decorator;

import neusoft.sawyer.learn.decorator.decorator.HighHouse;
import neusoft.sawyer.learn.decorator.decorator.Villa;
import neusoft.sawyer.learn.decorator.house.NormalHouse;

/**
 * Created by sawyer on 2019-06-18.
 */
public class Main {

    public static void main(String[] args) {
        House normalHouse = new NormalHouse();
        System.out.println(normalHouse);
        House highHouse = new HighHouse(normalHouse);
        System.out.println(highHouse);
        House villa = new Villa(highHouse);
        System.out.println(villa);
    }
}
