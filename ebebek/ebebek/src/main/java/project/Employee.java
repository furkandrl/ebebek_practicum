package project;

public class Employee {
    static final int CURRENT_YEAR=2021;
    private String name;
    private double salary;
    private int workHoursInWeek;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHoursInWeek = workHours;
        this.hireYear = hireYear;
    }

    public double tax(double salary){
        if(salary < 1000){
            return  0;
        }
        if(salary >1000){
            return salary*0.03;
        }
        return 0;
    }

    public double bonus(int workHoursInWeek){
        if(workHoursInWeek > 40){
            return (workHoursInWeek-40)*30*4; // x4 for bonus of a month
        }
        return 0;
    }

    public double raiseSalary(){
        var hireYear = getHireYear();
        var salaryWithTaxAndBonus = salaryWithTaxAndBonus();
        if((CURRENT_YEAR-hireYear) <10 ){
            return salaryWithTaxAndBonus*0.05;
        }else if((CURRENT_YEAR-hireYear) > 9 && (CURRENT_YEAR-hireYear) < 20){
            return salaryWithTaxAndBonus*0.1;
        }else if((CURRENT_YEAR-hireYear) > 19){
            return salaryWithTaxAndBonus*0.15;
        }
        return 0;
    }

    public double totalSalary(){
        var salary = getSalary();
        var workHoursInWeek = getWorkHoursInWeek();
        return salary+bonus(workHoursInWeek);
    }

    public double salaryWithTaxAndBonus(){
        var salary = getSalary();
        return totalSalary()-tax(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkHoursInWeek() {
        return workHoursInWeek;
    }

    public void setWorkHoursInWeek(int workHoursInWeek) {
        this.workHoursInWeek = workHoursInWeek;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", \n salary=" + salary +
                ", \n workHoursInWeek=" + workHoursInWeek +
                ", \n hireYear=" + hireYear +
                ", \n totalSalary=" + totalSalary() +
                ", \n salaryWithTaxAndBonus=" + salaryWithTaxAndBonus() +
                ", \n raiseSalary=" + raiseSalary() +
                '}';
    }

}
