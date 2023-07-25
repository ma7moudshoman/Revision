package Revision;





public class CommisionEmployee extends Employee implements Displayable {

double gross_salary;
double commission_rate;


public CommisionEmployee(){

}

    @Override
    public double ernaings() {
        return  gross_salary * commission_rate;
    }

    public CommisionEmployee(String name, int ssn, String address, Gender sex, double gross_salary, double commission_rate) {
        super(name, ssn, address, sex);
        this.gross_salary = gross_salary;
        this.commission_rate = commission_rate;
    }

    public double getGross_salary() {
        return gross_salary;
    }

    public void setGross_salary(double gross_salary) {
        this.gross_salary = gross_salary;
    }

    public double getCommission_rate() {
        return commission_rate;
    }

    public void setCommission_rate(double commission_rate) {
        this.commission_rate = commission_rate;

    }


    @Override
    public String toString() {
        return "CommissionEmployee{" + "gross_salary=" + gross_salary + ", commission_rate=" + commission_rate + '}';
    }

    public  void  Displayalldetails(){
        System.out.println(toString());
        System.out.println(super.toString());

        }
    public void  Displayearning(){
        System.out.println(ernaings());
    }

}
