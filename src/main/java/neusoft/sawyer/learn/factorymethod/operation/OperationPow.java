package neusoft.sawyer.learn.factorymethod.operation;

import neusoft.sawyer.learn.simplefactory.Operation;

/**
 * Created by sawyer on 2019-06-18.
 */
public class OperationPow implements Operation {

    @Override
    public double operation(double a, double b) {
        return Math.pow(a, b);
    }
}
