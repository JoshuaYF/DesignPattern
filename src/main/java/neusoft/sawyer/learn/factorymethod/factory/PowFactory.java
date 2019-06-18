package neusoft.sawyer.learn.factorymethod.factory;

import neusoft.sawyer.learn.factorymethod.OperationFactory;
import neusoft.sawyer.learn.factorymethod.operation.OperationPow;
import neusoft.sawyer.learn.simplefactory.Operation;

/**
 * Created by sawyer on 2019-06-18.
 */
public class PowFactory implements OperationFactory {

    @Override
    public Operation createOperation() {
        return new OperationPow();
    }
}
