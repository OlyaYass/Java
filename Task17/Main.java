public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setName("Mike");
        employee.setSalary(1234);

        EmployeeView view = new EmployeeView();

        EmployeeContoller contoller = new EmployeeContoller(employee,view);
        contoller.updateView();

        contoller.setEmployeeSalary(5678);
        System.out.println("\nAfter updating:");
        contoller.updateView();
    }
}