package neusoft.sawyer.learn.proxy;

/**
 * Created by sawyer on 2019-06-18.
 */
public class Main {

    public static void main(String[] args) {
        Subject subjectA = new RealSubjectA();
        System.out.println(subjectA.request());
        Subject subjectB = new RealSubjectB();
        System.out.println(subjectB.request());
        Subject proxyA = new Proxy(subjectA);
        System.out.println(proxyA.request());
        Subject proxyB = new Proxy(subjectB);
        System.out.println(proxyB.request());
    }
}
