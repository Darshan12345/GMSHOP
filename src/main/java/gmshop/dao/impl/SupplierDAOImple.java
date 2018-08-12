package gmshop.dao.impl;

import gmshop.dao.SupplierDAO;
import gmshop.model.Supplier;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional
public class SupplierDAOImple implements SupplierDAO {

@Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Supplier> getSuppliers() {
        return sessionFactory.getCurrentSession().createQuery("from Supplier").getResultList();
    }

    @Override
    public Supplier getSupplier(int id) {
        return sessionFactory.getCurrentSession().get(Supplier.class,id);
    }

    @Override
    public void saveOrUpdateSupplier(Supplier supplier) {
Session session=sessionFactory.getCurrentSession();
        session.save(supplier);
        session.flush();
    }

    @Override
    public void deleteSupplier(int id) {

        Session session=sessionFactory.getCurrentSession();

        Query query=session.createQuery("delete from Supplier where supplier_id=:id");
        query.setParameter("id",id);
        query.executeUpdate();
        session.flush();
    }
}
