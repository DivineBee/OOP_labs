package organization;

public class Patient extends Person {
    protected String id;
    protected FullName name;
    protected Gender gender;
    protected Date birthData;
    protected Integer age;
    protected Date accepted;
    protected History sickness;
    protected String prescription;
    protected String allergies;
    protected String specialReqs;

    OperationStaff staff_1  = new OperationStaff();
}
