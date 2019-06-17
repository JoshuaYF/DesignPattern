package neusoft.sawyer.learn.factory;

import neusoft.sawyer.learn.factory.api.SawyerOperation;

import java.util.EnumSet;

/**
 * Created by sawyer on 2019-06-17.
 */
public class Main {

    public static void main(String[] args) {
        double a = 10.00d, b = 5.00d;
        EnumSet.allOf(OperationType.class).forEach(operationType -> {
            double operationResult = SawyerOperation.operation(operationType, a, b);
            System.out.println(String.format("Operation type: %s; a = %.2f, b = %.2f, result = %.2f", operationType.name(), a, b, operationResult));
        });
    }
}
