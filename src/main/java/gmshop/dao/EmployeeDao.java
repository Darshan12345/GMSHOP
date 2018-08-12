package gmshop.dao;

import gmshop.model.Employee;

import java.util.List;

public interface EmployeeDao {

    public List<Employee> getEmployees();
    public Employee getEmployee(int id);
    public void deleteEmployee(int id);
    public void updateEmployee(Employee employee);
    public void addEmployee(Employee employee);
}
