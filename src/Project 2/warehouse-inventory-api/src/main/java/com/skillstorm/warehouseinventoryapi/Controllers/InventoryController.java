// inventory Controller will take GET requests to display current inventory stock
// get request to get inventory by ID
//Post requests to add inventory received
// PUT requests to update quantity after being sold
// DELETE requests to remove discontinued items


package com.skillstorm.warehouseinventoryapi.Controllers;

import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class InventoryController {

    @GetMapping("/Inventory")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }

    @PostMapping("/Receiving")
    public String postMethodName(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }
    
    @PutMapping("/shipped/{id}")
    public String putMethodName(@PathVariable String id, @RequestBody String entity) {
        //TODO: process PUT request
        
        return entity;
    }

    // @DeleteMapping

    // how to add delete request?

}
