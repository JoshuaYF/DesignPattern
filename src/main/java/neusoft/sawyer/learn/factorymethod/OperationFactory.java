package neusoft.sawyer.learn.factorymethod;

import neusoft.sawyer.learn.simplefactory.Operation;

/**
 * Created by sawyer on 2019-06-18.
 */
public interface OperationFactory {

    Operation createOperation();
}
