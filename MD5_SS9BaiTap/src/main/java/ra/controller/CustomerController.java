package ra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import ra.model.Customer;
import ra.service.CustomerService;
import ra.service.ICustomerService;

import java.util.List;

@Controller
public class CustomerController {
    private ICustomerService customerService=new CustomerService();
    @GetMapping("/")
    public ModelAndView showListCustomer(){
        List<Customer> listCustomer=customerService.findAll();
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("listCustomer", listCustomer );
        return modelAndView;
    }
}
