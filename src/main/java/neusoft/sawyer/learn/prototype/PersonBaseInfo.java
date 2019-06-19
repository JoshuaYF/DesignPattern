package neusoft.sawyer.learn.prototype;

/**
 * Created by sawyer on 2019-06-19.
 */
public class PersonBaseInfo extends Prototype {

    private String name;

    private Gender gender;

    private int age;

    public PersonBaseInfo(String name) {
        this.name = name;
    }

    private PersonBaseInfo() {

    }

    @Override
    public Prototype clone() {
        PersonBaseInfo personBaseInfo = new PersonBaseInfo();
        personBaseInfo.name = name;
        personBaseInfo.gender = gender;
        personBaseInfo.age = age;
        return personBaseInfo;
    }

    public void setInfo(Gender gender, int age) {
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
