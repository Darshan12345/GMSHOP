package gmshop.service;

import gmshop.model.Supplier;

import java.util.List;

public interface SupplierService {

    public List<Supplier> getSuppliers();
    public Supplier getSupplier(int id);
    public void saveOrUpdateSupplier(Supplier supplier);
    public void deleteSupplier(int id);
}
