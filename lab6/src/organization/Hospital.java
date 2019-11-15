package organization;

import java.util.ArrayList;

public class Hospital {
    protected String name;
    protected Address address;
    protected Phone phone;

    protected ArrayList<Department> department = new ArrayList<Department>();

    public void addDepartement(Department s){
        department.add(s);
    }
}
