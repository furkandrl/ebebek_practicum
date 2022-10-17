package project;

public class TestEmployee {
    public static void main(String[] args) {

        System.out.println("salary < 1000; tax=0");
        var employee1 = new Employee("dereli", 999, 40, 1991);
        System.out.println(employee1);
        System.out.println("----------------------\n");

        System.out.println("salary > 1000; tax= salary*0.03");
        var employee2= new Employee("dereli", 1001, 40, 1991);
        System.out.println(employee2);
        System.out.println("----------------------\n");

        System.out.println("workHoursInWeek < 40; bonus=0");
        var employee3 = new Employee("dereli", 1000, 39, 1991);
        System.out.println(employee3);
        System.out.println("----------------------\n");

        System.out.println("workHoursInWeek > 40; bonus=extraHour*30*4(in a month)");
        var employee4 = new Employee("dereli", 1000, 41, 1991);
        System.out.println(employee4);
        System.out.println("----------------------\n");

        System.out.println("workYear < 10; (salary+bonus-tax)*0.05");
        var employee5 = new Employee("dereli", 1000, 40, 2012);
        System.out.println(employee5);
        System.out.println("----------------------\n");

        System.out.println("9 < workYear < 20; (salary+bonus-tax)*0.1");
        var employee6 = new Employee("dereli", 1000, 40, 2005);
        System.out.println(employee6);
        System.out.println("----------------------\n");

        System.out.println("workYear > 19; (salary+bonus-tax)*0.15");
        var employee7 = new Employee("dereli", 1000, 40, 2000);
        System.out.println(employee7);



    }
}
