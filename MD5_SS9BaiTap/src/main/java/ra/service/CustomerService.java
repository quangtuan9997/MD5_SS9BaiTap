package ra.service;

import org.springframework.stereotype.Service;
import ra.model.Customer;

import java.util.ArrayList;
import java.util.List;
@Service
public class CustomerService implements ICustomerService{

    @Override
    public List<Customer> findAll() {
        Customer customer=new Customer(1L,"sdsd",12);
        List<Customer> customerList=new ArrayList<>();
customerList.add(customer);
        return customerList;
    }

    @Override
    public Customer save(Customer customer) {
        return null;
    }

    @Override
    public Customer findById(Long aLong) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }
}
