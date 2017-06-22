package unidue.ub.services.settings;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Eike on 22.06.2017.
 */
@Entity
public class Usersettings {

    @Id
    @GeneratedValue
    private Long id;

    private String fullname;

    private String email;

    private double timePeriod;

    private String[] subjects;

    private String[] Substitute;

    private Integer yearsToAverage;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(double timePeriod) {
        this.timePeriod = timePeriod;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public String[] getSubstitute() {
        return Substitute;
    }

    public void setSubstitute(String[] substitute) {
        Substitute = substitute;
    }

    public Integer getYearsToAverage() {
        return yearsToAverage;
    }

    public void setYearsToAverage(Integer yearsToAverage) {
        this.yearsToAverage = yearsToAverage;
    }
}
