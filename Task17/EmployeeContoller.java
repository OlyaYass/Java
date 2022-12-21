// уровень контроллера
public class EmployeeContoller {
    private Employee model;
    private EmployeeView view;

    public EmployeeContoller(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }
    public String getEmployeeName() {
        return model.getName();
    }
    public void setEmployeeSalary(int salary) {
        model.setSalary(salary);
    }
    public int getEmployeeSalary() {
        return model.getSalary();
    }

    public void updateView() {
        view.printEmployeeInfo(model.getName(), model.getSalary());
    }
}
