package gmshop.dao.impl;

import gmshop.dao.EmployeeDao;
import gmshop.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional
public class EmployeeDAOImple implements EmployeeDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Employee> getEmployees() {
        return sessionFactory.getCurrentSession().createQuery("from Employee").getResultList();
    }

    @Override
    public Employee getEmployee(int id) {
        return sessionFactory.getCurrentSession().get(Employee.class,id);
    }

    @Override
    public void deleteEmployee(int id) {
       Session session= sessionFactory.getCurrentSession();
       Query query=session.createQuery("delete from Employee where employee_ssn=:id");

       query.setParameter("id",id);
       query.executeUpdate();
    }

    @Override
    public void updateEmployee(Employee employee) {

        sessionFactory.getCurrentSession().saveOrUpdate(employee);
    }

    @Override
    public void addEmployee(Employee employee) {
        sessionFactory.getCurrentSession().save(employee);
    }
}
