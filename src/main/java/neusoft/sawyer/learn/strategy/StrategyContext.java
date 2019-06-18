package neusoft.sawyer.learn.strategy;

import neusoft.sawyer.learn.simplefactory.Operation;
import neusoft.sawyer.learn.simplefactory.OperationType;
import neusoft.sawyer.learn.simplefactory.operation.OperationAdd;
import neusoft.sawyer.learn.simplefactory.operation.OperationDiv;
import neusoft.sawyer.learn.simplefactory.operation.OperationMul;
import neusoft.sawyer.learn.simplefactory.operation.OperationSub;

/**
 * Created by sawyer on 2019-06-18.
 * <p>
 * 策略模式与简单工厂结合
 */
public class StrategyContext {

    private Operation operation;

    public StrategyContext(OperationType operationType) {
        switch (operationType) {
            case ADD:
                operation = new OperationAdd();
                break;
            case SUB:
                operation = new OperationSub();
                break;
            case MUL:
                operation = new OperationMul();
                break;
            case DIV:
                operation = new OperationDiv();
                break;
            default:
                throw new RuntimeException("不支持的算法类型");
        }
    }

    public double operation(double a, double b) {
        return operation.operation(a, b);
    }
}
