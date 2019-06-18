package neusoft.sawyer.learn.simplefactory;

import neusoft.sawyer.learn.simplefactory.operation.OperationAdd;
import neusoft.sawyer.learn.simplefactory.operation.OperationDiv;
import neusoft.sawyer.learn.simplefactory.operation.OperationMul;
import neusoft.sawyer.learn.simplefactory.operation.OperationSub;

/**
 * Created by sawyer on 2019-06-17.
 */
public class OperationSimpleFactory {

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
