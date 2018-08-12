package gmshop.dao;

import gmshop.model.Supplier;

import java.util.List;

public interface SupplierDAO {

    List<Supplier> getSuppliers();
    Supplier getSupplier(int id);
    void saveOrUpdateSupplier(Supplier supplier);
     void deleteSupplier(int id);
}
