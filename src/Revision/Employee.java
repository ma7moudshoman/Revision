package Revision;

enum Gender{male,female};

public abstract class Employee {
  String name;
  int Ssn;
  String Address;
  Gender sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSsn() {
        return Ssn;
    }

    public void setSsn(int ssn) {
        Ssn = ssn;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    public Employee() {
    }

    public Employee(String name, int ssn, String address, Gender sex) {
        this.name = name;
        Ssn = ssn;
        Address = address;
        this.sex = sex;
    }
public abstract double ernaings();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' + ", Ssn=" + Ssn + ", Address='" + Address + '\'' + ", sex=" + sex + '}';
    }
}

