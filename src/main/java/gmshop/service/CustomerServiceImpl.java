package gmshop.service;

import java.util.List;

import gmshop.dao.customerDAO;
import gmshop.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

@Transactional
public class CustomerServiceImpl implements CustomerService {

	// need to inject customer dao
	@Autowired
	private gmshop.dao.customerDAO customerDAO;

	public List<Customer> getCustomers() {
		return customerDAO.getCustomer();
	}

	public void saveCustomer(Customer theCustomer) {
		customerDAO.saveCustomer(theCustomer);
	}
}





