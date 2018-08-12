package gmshop.controller;

import gmshop.model.Supplier;
import gmshop.service.SupplierService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller

@RequestMapping("/supplier")
public class SupplierController {

@Autowired
SupplierService supplierService;


    @RequestMapping("/saveSupplier")
    public String saveSupplier(@Valid @ModelAttribute("supplier") Supplier supplier, BindingResult result){


        if(result.hasErrors()){
            return "addSupplier";
        }
        else
        {
            supplierService.saveOrUpdateSupplier(supplier);
            return "redirect:/";
        }

    }



    @RequestMapping("/addSupplier")
    private String addSupplier(Model model){

        model.addAttribute("supplier",new Supplier());
        return "addSupplier";
    }
}
