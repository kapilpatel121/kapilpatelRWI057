package com.uc.service;

import org.springframework.stereotype.Service;

import com.uc.entity.Invoice;
import com.uc.entity.InvoiceItem;
import com.uc.repo.InvoiceRepository;

@Service
public class InvoiceService {
    private final InvoiceRepository invoiceRepository;

    public InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public Invoice createInvoice() {
        Invoice invoice = new Invoice();
        return invoiceRepository.save(invoice);
    }

    public Invoice addItemToInvoice(Long invoiceId, String name, double price, int quantity) {
        Invoice invoice = invoiceRepository.findById(invoiceId)
                .orElseThrow(() -> new IllegalArgumentException("Invoice not found with id: " + invoiceId));

        InvoiceItem item = new InvoiceItem();
        item.setInvoice(invoice);
        item.setName(name);
        item.setPrice(price);
        item.setQuantity(quantity);

        invoice.getItems().add(item);

        return invoiceRepository.save(invoice);
    }

    // Other service methods as needed
}
