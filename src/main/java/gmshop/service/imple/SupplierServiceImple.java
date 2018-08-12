package gmshop.service.imple;

import gmshop.dao.SupplierDAO;

import gmshop.model.Supplier;
import gmshop.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImple implements SupplierService {

    @Autowired
  private SupplierDAO supplierDAOImple;

    @Override


    public List<Supplier> getSuppliers() {
        return supplierDAOImple.getSuppliers();
    }

    @Override

    public Supplier getSupplier(int id) {
        return supplierDAOImple.getSupplier(id);
    }

    @Override

    public void saveOrUpdateSupplier(Supplier supplier) {
        supplierDAOImple.saveOrUpdateSupplier(supplier);
    }

    @Override


    public void deleteSupplier(int id) {
    supplierDAOImple.deleteSupplier(id);
    }
}
