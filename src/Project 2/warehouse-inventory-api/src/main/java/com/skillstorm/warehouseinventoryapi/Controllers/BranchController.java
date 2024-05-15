// this controller is used for GET requests in order to display the different Branch locations
// fix GET warehouse ID for Warehouse data
// add PUT method to create new Branch

package com.skillstorm.warehouseinventoryapi.controllers;
// rename folders to lowercase
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.warehouseinventoryapi.models.Branch;
import com.skillstorm.warehouseinventoryapi.services.BranchService;

import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/locations")
public class BranchController {

    
    private final BranchService branchService;

    
    public BranchController(BranchService branchservice){
        this.branchService = branchservice; 
    }

    // returns the different branch locations
    @GetMapping("/locations") // get method converts list to JSON
    @ResponseStatus (code = HttpStatus.OK)
    public List<Branch> findAll(@RequestParam(required = false) String name) {
        if (name == null) {
            return branchService.findAll();
        }else {
            return findbyName(name);
        }  

    }
    private List<Branch> findbyName(String name) {
        return branchService.findByName(name);
    }

    // GET request to return branches by ID and display data
    @GetMapping("/{id}")
    public Optional<Branch> branchData(int id) { // had to change to optional 
        return branchService.findbyId(id);
    }

    // POST request to add new branches

    @PostMapping("create")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Branch createBranch(@Valid @RequestBody Branch branch) { // this needs authentication
        
        return branchService.create(branch); // null check
    }

    // updates an existing product i.e quantity
    @PutMapping("/{id}")
    public Branch updateBranch(@PathVariable int id, @RequestBody Branch product){
        return updateBranch(id, product); // edge case check
    }

// DELETE reqeust to remove Branch by ID
     @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT) // 204 // this needs authentication
    public void deleteBranch(@PathVariable int id) { 
        branchService.deleteById(id); // edge cases check
 
    }
}


    


