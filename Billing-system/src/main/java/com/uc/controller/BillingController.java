package com.uc.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.uc.entity.CashFlow;
import com.uc.entity.Product;
import com.uc.service.CashFlowService;
import com.uc.service.InvoiceService;
import com.uc.service.ProductService;

@Controller
public class BillingController {
    private final InvoiceService invoiceService;
    private final ProductService productService;
    private final CashFlowService cashFlowService;

    public BillingController(InvoiceService invoiceService, ProductService productService, CashFlowService cashFlowService) {
        this.invoiceService = invoiceService;
        this.productService = productService;
        this.cashFlowService = cashFlowService;
    }
       
    @GetMapping("/")
    public String dashboard() {
        return "dashboard";
    }
    @GetMapping("/products")
    public String getAllProducts(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "products";
    }

    @GetMapping("/cash-flows")
    public String getCashFlowsByDate(@RequestParam Date date, Model model) {
        Optional<CashFlow> cashFlows = cashFlowService.getCashFlowsByDate(date);
        model.addAttribute("cashFlows", cashFlows);
        return "cash_flows";
    }

    // Other controller methods for billing as before
}
