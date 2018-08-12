package gmshop.dao.impl;
import gmshop.dao.customerDAO;
import gmshop.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public class customerDAOImple implements customerDAO {

    @Autowired
   private SessionFactory sessionFactory;
    public List<Customer> getCustomer() {

        Session session=sessionFactory.getCurrentSession();
        Query<Customer> query=  session.createQuery("from Customer", Customer.class);
        List<Customer> list=query.getResultList();
        session.flush();
        return list;
    }

    public void saveCustomer(Customer customer) {

        Session session=sessionFactory.getCurrentSession();

        session.save(customer);

        session.flush();
    }

    public void deleteCustomer(int id) {

        Session session=sessionFactory.getCurrentSession();

        Query query=session.createQuery("delete from Customer where customer_id=:customerId");
        query.setParameter("customerId",id);
        query.executeUpdate();
        session.flush();
    }

    public Customer getCustomer(int id) {

        return sessionFactory.getCurrentSession().get(Customer.class,id);
    }
}
