package FinalAssignment;

public abstract class Employee  {
    private String ssn;
    private String firstName;
    private String lastName;
    private String birthDay;
    private String phone;
    private String email;
    public Employee(String ssn, String firstName, String lastName) {
        this.ssn = ssn;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Employee() {}

    public Employee(String ssn, String firstName, String lastName, String birthDay, String phone, String email)
    {
        this.ssn = ssn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
    }
    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public abstract void display();
}
