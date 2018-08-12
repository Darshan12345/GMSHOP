package gmshop.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "employee")
public class Employee {
    public Employee() {

    }

    @Id

            @Column(name = "employee_ssn",unique = true)
    @Pattern(regexp="(^|[0-9]{10})", message = "enter 10 digit number")
    long employee_ssn;

    @Range(min = 0,message = "must be > 0")
    double employee_salary;

    @NotEmpty(message = "pls enter first name")
            @Size(min = 2,max = 30)
    String employee_firstName;

    @NotEmpty(message = "pls enter last name")
            @Size(min=2,max = 30)
    String employee_lastName;


    @NotEmpty
            @Size(min=5,max=50)
    String employee_address;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    Date employee_birthdate;

    @NotEmpty
    String employee_sex;

    public long getEmployee_ssn() {
        return employee_ssn;
    }

    public void setEmployee_ssn(long employee_ssn) {
        this.employee_ssn = employee_ssn;
    }

    public double getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(double employee_salary) {
        this.employee_salary = employee_salary;
    }

    public String getEmployee_firstName() {
        return employee_firstName;
    }

    public void setEmployee_firstName(String employee_firstName) {
        this.employee_firstName = employee_firstName;
    }

    public String getEmployee_lastName() {
        return employee_lastName;
    }

    public void setEmployee_lastName(String employee_lastName) {
        this.employee_lastName = employee_lastName;
    }

    public String getEmployee_address() {
        return employee_address;
    }

    public void setEmployee_address(String employee_address) {
        this.employee_address = employee_address;
    }

    public Date getEmployee_birthdate() {
        return employee_birthdate;
    }

    public void setEmployee_birthdate(Date employee_birthdate) {
        this.employee_birthdate = employee_birthdate;
    }

    public String getEmployee_sex() {
        return employee_sex;
    }

    public void setEmployee_sex(String employee_sex) {
        this.employee_sex = employee_sex;
    }
}
