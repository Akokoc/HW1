package modal;

public class WageEmployee extends Employee {
    int hours;
    double wage;

    public WageEmployee(String name, long id, int age, String company, double baseSalary, int hours, double wage) {
        super(name, id, age, company, baseSalary);//вызов конструктор базового класса
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "WageEmployee{" +
                ", hours=" + hours +
                ", wage=" + wage +
                "} " + super.toString();
    }

    @Override
    public double calcSalary(){
        double salary=hours*wage;
        return salary;
    }
}

