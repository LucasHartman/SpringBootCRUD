package com.example.SpringBootCRUDExample.excpetion;

/*
-- This Class
-   Creates an Custom RuntimeException, and is initialized whenever a Invoice can't be found
-   Go to InvoiceServiceImpl.java > getInvoiceById() to see the exception getting thrown

-- Step 04A
-   Create a custom Exception class
-   handle exceptions if any user search for an Invoice by Invoice Id and the same doesnt exist at all.
-   Let’s suppose a user search from the browser using direct URL, then there is a possibility that the invoice may not exist.
-   we need to provide the user a readable message.
 */

public class InvoiceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public InvoiceNotFoundException() {
        super();
    }

    public InvoiceNotFoundException(String customMessage) {
        super(customMessage);
    }
}