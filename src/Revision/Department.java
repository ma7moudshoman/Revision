package Revision;

import java.util.ArrayList;

public class Department {
    int dno;

    String dname;
    ArrayList<Employee>employeeArrayList;
    public  Department(){

    }

    public Department(int dno, String dname) {
        this.dno = dno;
        this.dname = dname;
        employeeArrayList=new ArrayList<Employee>();
    }

    public int getDno() {
        return dno;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
    public void addemployee(Employee e)
    {
        employeeArrayList.add(e);
    }
    public void RemoveEmployee(Employee indx)
    {
        employeeArrayList.remove(indx);
    }

    public int getemployeecount(){
        return employeeArrayList.size();

    }
    public void printBasicData() {
        for (int i = 0; i < employeeArrayList.size(); i++) {
            System.out.println(employeeArrayList.get(i).getSsn() + "  " + employeeArrayList.get(i).getName() + "   " + employeeArrayList.get(i).getSex());
        }
    }
}
