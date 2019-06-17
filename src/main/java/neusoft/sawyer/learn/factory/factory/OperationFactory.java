package neusoft.sawyer.learn.factory.factory;

import neusoft.sawyer.learn.factory.Operation;
import neusoft.sawyer.learn.factory.OperationType;
import neusoft.sawyer.learn.factory.operation.OperationAdd;
import neusoft.sawyer.learn.factory.operation.OperationDiv;
import neusoft.sawyer.learn.factory.operation.OperationMul;
import neusoft.sawyer.learn.factory.operation.OperationSub;

/**
 * Created by sawyer on 2019-06-17.
 */
public class OperationFactory {

    public static Operation createOperation(OperationType operationType) {
        switch (operationType) {
            case ADD:
                return new OperationAdd();
            case SUB:
                return new OperationSub();
            case MUL:
                return new OperationMul();
            case DIV:
                return new OperationDiv();
            default:
                throw new RuntimeException("不支持的算法类型");
        }
    }
}
