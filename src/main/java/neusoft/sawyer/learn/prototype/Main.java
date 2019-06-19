package neusoft.sawyer.learn.prototype;

import java.time.LocalDate;

/**
 * Created by sawyer on 2019-06-19.
 */
public class Main {

    public static void main(String[] args) {
        Resume resume1 = new Resume("Sawyer");
        resume1.setPersonBaseInfo(Gender.MALE, 28);
        resume1.setWorkExperience(LocalDate.of(2015, 10, 21), LocalDate.of(2017, 10, 21), "一条");

        Resume resume2 = (Resume) resume1.clone();
        resume2.setWorkExperience(LocalDate.of(2017, 10, 21), LocalDate.of(2018, 6, 10), "Alibaba");

        Resume resume3 = (Resume) resume2.clone();
        resume3.setPersonBaseInfo(Gender.FEMALE, 18);
        resume3.setWorkExperience(LocalDate.of(2018, 6, 10), LocalDate.of(2019, 6, 21), "NetEase");

        System.out.println(resume1);
        System.out.println(resume2);
        System.out.println(resume3);
    }
}
