package neusoft.sawyer.learn.factorymethod.factory;

import neusoft.sawyer.learn.factorymethod.OperationFactory;
import neusoft.sawyer.learn.simplefactory.Operation;
import neusoft.sawyer.learn.simplefactory.operation.OperationSub;

/**
 * Created by sawyer on 2019-06-18.
 */
public class SubFactory implements OperationFactory {

    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
