package neusoft.sawyer.learn.prototype;

import java.time.LocalDate;

/**
 * Created by sawyer on 2019-06-19.
 */
public class WorkExperience extends Prototype {

    private LocalDate startDate;

    private LocalDate endDate;

    private String companyName;

    public void setWorkExperience(LocalDate startDate, LocalDate endDate, String companyName) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.companyName = companyName;
    }

    @Override
    public Prototype clone() {
        WorkExperience workExperience = new WorkExperience();
        workExperience.startDate = startDate;
        workExperience.endDate = endDate;
        workExperience.companyName = companyName;
        return workExperience;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getCompanyName() {
        return companyName;
    }
}
