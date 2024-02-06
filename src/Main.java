public class Main {
    static int empid = 1;
    static Employee [] empArr = new Employee[10];
    public static void main(String[] args) {


        empArr[0] = new Employee("Alexey", "Alexeevich", "Alexeev", 1, 70000, empid);
        empArr[1] = new Employee("Alexandr", "Alexandrovich", "Alexandrov", 2, 75000, empid);
        empArr[2] = new Employee("Alla", "Antonovna", "Antonova", 1, 60000, empid);
        empArr[3] = new Employee("Boris", "Borisovich", "Borisov", 3, 80000, empid);
        empArr[4] = new Employee("Victor", "Victorovich", "Victorov", 4, 90000, empid);
        empArr[5] = new Employee("Valentina", "Valentinovna", "Valentinova", 2, 65000, empid);
        empArr[6] = new Employee("Maria", "Maximovna", "Maximova", 3, 70000, empid);
        empArr[7] = new Employee("Natalia", "Nikolaevna", "Nikolaeva", 4, 80000, empid);
        empArr[8] = new Employee("Sergey", "Sergeevich", "Sergeev", 5, 95000, empid);
        empArr[9] = new Employee("Tatiana", "Timofeevna", "Timofeeva", 5, 85000, empid);

        prepareEmployeeDataList(empid);
        System.out.println();
        calculateMonthlySalaryBudget();
        System.out.println();
        findMinSalary();
        System.out.println();
        findMaxSalary();
        System.out.println();
        calculateAverageSalary();
        System.out.println();
        prepareEmployeeNameList();
        System.out.println();
    }
    public static void prepareEmployeeDataList (int empid) {
            for (int i = 0; i < empArr.length; i++) {
                System.out.println(empArr[i]);
            }
        }
    public static void calculateMonthlySalaryBudget () {
        int total = 0;
        for (Employee emp : empArr) {
                total = total + emp.getSalary();
            }
        System.out.println("Monthly salary budget is " + total + " roubles");
    }
    public static void findMinSalary () {
        int i;
        int salary = empArr[0].getSalary();
        Employee employeeMinSalary = empArr[0];
        for (i = 0; i < empArr.length; i++) {
            if (empArr[i].getSalary() < salary) {
                employeeMinSalary = empArr[i];
                salary = empArr[i].getSalary();
            }
        }
        System.out.println("Employee with minimal salary: " +
                "id = " + employeeMinSalary.getId() +
                " first name = " + employeeMinSalary.getFirstName() +
                " middle name = " + employeeMinSalary.getMiddleName() +
                " last name = " + employeeMinSalary.getLastName());
    }
    public static void findMaxSalary () {
        int i;
        int salary = empArr[0].getSalary();
        Employee employeeMaxSalary = empArr[0];
        for (i = 0; i < empArr.length; i++) {
            if (empArr[i].getSalary() > salary) {
                employeeMaxSalary = empArr[i];
                salary = empArr[i].getSalary();
            }
        }
        System.out.println("Employee with maximal salary: " +
                "id = " + employeeMaxSalary.getId() +
                " first name = " + employeeMaxSalary.getFirstName() +
                " middle name = " + employeeMaxSalary.getMiddleName() +
                " last name = " + employeeMaxSalary.getLastName());
    }
    public static void calculateAverageSalary () {
        int total = 0;
        int average = 0;
        for (Employee employee : empArr) {
            total = total + employee.getSalary();
            average = total / empArr.length;
        }
        System.out.println("Average salary is " + average + " roubles");
    }
    public static void prepareEmployeeNameList () {
        for (int i = 0; i < empArr.length; i++) {
            System.out.println("Employees names are: " +
            empArr[i].getFirstName() + " " +
            empArr[i].getMiddleName() + " " +
            empArr[i].getLastName());
        }
    }
}

