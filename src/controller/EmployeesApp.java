package controller;

import modal.*;

public class EmployeesApp {
    public static void main(String[] args) {
        Person p1 = new Manager("Viktor", 11, 40, "Google", 7000, 4);
        Person p2 = new Manager("Angela", 112, 30, "Avira", 4000, 1);
        Person p3 = new Manager("Andrey", 1123, 28, "Cinemo", 8000, 2);

        Person p4 = new SalesMan("Gena", 11235, 34, "Yandex", 2000, 1, 1);
        Person p5 = new SalesMan("Lena", 112358, 19, "JB", 4000, 2, 2);
        Person p6 = new SalesMan("Jan", 11235813, 26, "Epaymens", 2500, 33, 3);

        Person p7 = new WageEmployee("Mira", 112358131, 29, "Kaspersky", 4345, 56, 20);
        Person p8 = new WageEmployee("Lira", 11235121, 24, "Youtube", 5555, 234, 70);
        Person p9 = new WageEmployee("Kiril", 1123321, 29, "Facebook", 9000, 160, 100);

        Employee[] emps = {
                (Employee) p1,
                (Employee) p2,
                (Employee) p3,
                (Employee) p4,
                (Employee) p5,
                (Employee) p6,
                (Employee) p7,
                (Employee) p8,
                (Employee) p9
        };

        getSumSalaryAllEmployees(emps);
        System.out.println(getSumSalaryAllEmployees(emps));
        printEmpsWithSalaryMoreThan(emps,8000);
        getСompanyRevenue(emps);
        System.out.println(getСompanyRevenue(emps));


    }

    private static double getSumSalaryAllEmployees(Employee[] emps) {
        double res = 0;
        for (int i = 0; i < emps.length; i++) {
            res += emps[i].calcSalary();
        }
        return res;
    }

    private static void printEmpsWithSalaryMoreThan(Employee[] emps, double salary) {
        double res = 0;
        for (int i = 0; i < emps.length; i++) {
            if (emps[i].calcSalary() >= salary) {
                System.out.println(emps[i].toString());
            }
        }
    }

    private static double getСompanyRevenue(Employee[] emps) {
        double res = 0;
        for (int i = 0; i < emps.length; i++) {
            if (emps[i] instanceof SalesMan) {
                SalesMan ts = (SalesMan) emps[i];
                res += ts.getTotalSales();
            }

        }
        return res;
    }
}
