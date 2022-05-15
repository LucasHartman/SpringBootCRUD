package com.example.SpringBootCRUDExample.service;

import java.util.List;
import java.util.Optional;

import com.example.SpringBootCRUDExample.excpetion.InvoiceNotFoundException;
import com.example.SpringBootCRUDExample.repo.InvoiceRepository;
import com.example.SpringBootCRUDExample.model.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
--  This Class
-   This class implement IInvoiceService, a contract with a number of abstract methods
-   This class calls, InvoiceRepository, which extends the JpaRepository
-   JpaRepository contains all the CRUD methods like: save, delete, findAll, findById, etc.
-   All methods in this class make use of the JpaRepository methods
 */

@Service
public class InvoiceServiceImpl implements IInvoiceService{

    @Autowired
    private InvoiceRepository repo;

    @Override
    public Invoice saveInvoice(Invoice invoice) {
        return repo.save(invoice);
    }

    @Override
    public List<Invoice> getAllInvoices() {
        return repo.findAll();
    }

    @Override
    public Invoice getInvoiceById(Long id) {
        Optional<Invoice> opt = repo.findById(id);
        if(opt.isPresent()) {
            return opt.get();
        } else {
            throw new InvoiceNotFoundException("Invoice with Id : "+id+" Not Found");
        }
    }

    @Override
    public void deleteInvoiceById(Long id) {
        repo.delete(getInvoiceById(id));
    }

    @Override
    public void updateInvoice(Invoice invoice) {
        repo.save(invoice);
    }
}