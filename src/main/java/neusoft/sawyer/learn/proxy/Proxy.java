package neusoft.sawyer.learn.proxy;

/**
 * Created by sawyer on 2019-06-18.
 */
public class Proxy extends Subject {

    private Subject realSubject;

    public Proxy(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public String request() {
        return "I'm is a proxy request, real request is: " + realSubject.request();
    }
}
