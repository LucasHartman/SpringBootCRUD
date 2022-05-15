package com.example.SpringBootCRUDExample.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/*
-- This Class
-   Creates an Entity

-- Step 03
-  Create Entity (model) class
 */

@Entity
@Data // combination of the @ToString, @EqualsAndHashCode, @Getter, @Setter and @RequiredArgsConstructor annotations.
@NoArgsConstructor // generates Default constructor
@AllArgsConstructor // generates all param constructor
public class Invoice {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String location;
    private Double amount;


    public Long getId() {
        return id;
    }
}