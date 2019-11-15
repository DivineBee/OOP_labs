package organization;

import java.util.ArrayList;

public class Department {
    ArrayList<Staff>  staff = new ArrayList<Staff>();

    public void addStaff(Staff s){
        staff.add(s);
    }
}
