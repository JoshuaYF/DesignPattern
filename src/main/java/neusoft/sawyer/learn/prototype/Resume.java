package neusoft.sawyer.learn.prototype;

import java.time.LocalDate;

/**
 * Created by sawyer on 2019-06-19.
 */
public class Resume extends Prototype {

    private PersonBaseInfo personBaseInfo;

    private WorkExperience workExperience;

    public Resume(String name) {
        personBaseInfo = new PersonBaseInfo(name);
        workExperience = new WorkExperience();
    }

    private Resume(PersonBaseInfo personBaseInfo, WorkExperience workExperience) {
        this.personBaseInfo = (PersonBaseInfo) personBaseInfo.clone();
        this.workExperience = (WorkExperience) workExperience.clone();
    }

    public void setPersonBaseInfo(Gender gender, int age) {
        personBaseInfo.setInfo(gender, age);
    }

    public void setWorkExperience(LocalDate startDate, LocalDate endDate, String companyName) {
        workExperience.setWorkExperience(startDate, endDate, companyName);
    }

    @Override
    public Prototype clone() {
        return new Resume(personBaseInfo, workExperience);
    }

    @Override
    public String toString() {
        return String.format("Name: %s, gender: %s, age: %s. StartDate: %s, endDate: %s, companyName: %s", personBaseInfo.getName(), personBaseInfo.getGender().name(), personBaseInfo.getAge(), workExperience.getStartDate(), workExperience.getEndDate(), workExperience.getCompanyName());
    }
}
