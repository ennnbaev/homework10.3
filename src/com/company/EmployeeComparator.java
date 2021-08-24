package com.company;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.salary-o2.salary==0){
            if(o1.lastName.compareTo(o2.lastName)==0){
                return o1.firstName.compareTo(o2.firstName);
            }
            else {
                return o1.lastName.compareTo(o2.lastName);
            }
        }
        else if(o1.salary- o2.salary<=0.5&&o1.salary- o2.salary>0){
            return 1;
        }
        else if(o1.salary- o2.salary>=-0.5&&o1.salary- o2.salary<0){
            return -1;
        }
        else {
            return (int)(o1.salary- o2.salary);
        }
    }
}
