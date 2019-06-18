package neusoft.sawyer.learn.strategy;

import neusoft.sawyer.learn.simplefactory.OperationType;

import java.util.EnumSet;

/**
 * Created by sawyer on 2019-06-18.
 */
public class Main {

    public static void main(String[] args) {
        double a = 10.00d, b = 5.00d;
        EnumSet.allOf(OperationType.class).forEach(operationType -> {
            StrategyContext strategyContext = new StrategyContext(operationType);
            double operationResult = strategyContext.operation(a, b);
            String msg = String.format("Operation type: %s; a = %.2f, b = %.2f, result = %.2f", operationType.name(), a, b, operationResult);
            System.out.println(msg);
        });
    }
}
