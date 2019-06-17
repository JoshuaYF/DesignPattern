package neusoft.sawyer.learn.factory.api;

import neusoft.sawyer.learn.factory.OperationType;
import neusoft.sawyer.learn.factory.factory.OperationFactory;

/**
 * Created by sawyer on 2019-06-17.
 */
public class SawyerOperation {

    public static double operation(OperationType operationType, double a, double b) {
        return OperationFactory.createOperation(operationType).operation(a, b);
    }
}
