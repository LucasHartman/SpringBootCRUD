package com.example.SpringBootCRUDExample.service;

import com.example.SpringBootCRUDExample.model.Invoice;

import java.util.List;

/*
-- This Class
-   Create an contract with a number of abstract methods
-   This class is implemented bij the InvoiceServiceImpl

-- Step 05
-   Create Service Interface & Service Impl classes
-   Service Layer of the application.
-   create one Service Interface and its Implementation class.
-   Annotate: @Service
-   In order to connect to Data Layer, we need to provide
    dependency of the Repository interface (created in Step#4)
    in our service implementation class via auto-wiring.

 */


public interface IInvoiceService {

    public Invoice saveInvoice(Invoice invoice);
    public List<Invoice> getAllInvoices();
    public Invoice getInvoiceById(Long id);
    public void deleteInvoiceById(Long id);
    public void updateInvoice(Invoice invoice);

}