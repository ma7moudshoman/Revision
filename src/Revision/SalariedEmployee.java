package Revision;

public class SalariedEmployee extends Employee implements Displayable {

    double Salary;
    double Bouns;
    double Deduction;

    public  SalariedEmployee(){}


    public SalariedEmployee( String name, int ssn, String address, Gender sex, double salary, double bouns, double deduction) {
        super(name, ssn, address, sex);
        Salary = salary;
        Bouns = bouns;
        Deduction = deduction;
    }
    @Override
    public double ernaings()
    {
        return (Salary + Bouns ) - Deduction ;
    }
    public  void  Displayalldetails(){
        System.out.println( super.toString());
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + "Salary=" + Salary + ", Bouns=" + Bouns + ", Deduction=" + Deduction + '}';
    }

    public void  Displayearning(){
        System.out.println(ernaings() );

    }
}