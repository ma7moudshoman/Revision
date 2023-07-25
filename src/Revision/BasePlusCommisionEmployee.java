package Revision;

public class BasePlusCommisionEmployee extends  CommisionEmployee{

    double base;
    public BasePlusCommisionEmployee(){

    }
    public BasePlusCommisionEmployee(double base){
        this.base=base;

    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "BasePlusCommisionEmployee{" + "base=" + base + '}';
    }
    @Override
    public double ernaings(){
        return  base+super.ernaings();

    }
@Override
    public  void  Displayalldetails(){
super.Displayalldetails();
Displayearning();
    }
    @Override
    public void  Displayearning(){
        System.out.println("rnaings="+ernaings());
    }


}
