package neusoft.sawyer.learn.factorymethod;

import neusoft.sawyer.learn.factorymethod.factory.AddFactory;
import neusoft.sawyer.learn.factorymethod.factory.PowFactory;
import neusoft.sawyer.learn.simplefactory.Operation;

/**
 * Created by sawyer on 2019-06-18.
 */
public class Main {

    public static void main(String[] args) {
        double a = 10.00d, b = 5.00d;

        OperationFactory addFactory = new AddFactory();
        Operation operationAdd = addFactory.createOperation();
        System.out.println(operationAdd.operation(a, b));

        // 新增次方运算工厂
        OperationFactory powFactory = new PowFactory();
        Operation operationPow = powFactory.createOperation();
        System.out.println(operationPow.operation(a, b));
    }
}
