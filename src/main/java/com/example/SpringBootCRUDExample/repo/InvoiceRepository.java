package com.example.SpringBootCRUDExample.repo;

/*

-- This Class
- extends JpaRepository, which hold al the CRUD methods like save, delete, find, etc.
-   InvoiceServiceImpl implements this class and makes use of the  JpaRepository methods

--  Repository Interface.
-   create a separate repository interface for each Entity in the application

-- Step 04
-   Create Repository Interface
-   For Database access
-   extend any Repository Interface provided by Spring Data JPA such as
    JpaRepository, CrudRepository, PagingAndSortingRepository etc.
-   for a basic CRUD operation, we don’t need to write any custom method in this interface.
-   Spring Data JPA will provide all the methods by default

 */
import com.example.SpringBootCRUDExample.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}