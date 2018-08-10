package gmshop.dao;

import gmshop.model.Customer;

import java.util.List;

public interface customerDAO{

public List<Customer> getCustomer();
public void saveCustomer(Customer customer);
public void deleteCustomer(int id);
public Customer getCustomer(int id);


}
