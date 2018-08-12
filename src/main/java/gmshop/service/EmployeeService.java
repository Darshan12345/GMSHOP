package gmshop.service;

import gmshop.model.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getEmployees();
    public Employee getEmployee(int id);
    public void deleteEmployee(int id);
    public void updateEmployee(Employee employee);
    public void addEmployee(Employee employee);
}
