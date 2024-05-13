// this controller is used for GET requests in order to display the different Branch locations
// fix GET warehouse ID for Warehouse data
// add PUT method to create new Branch

package com.skillstorm.warehouseinventoryapi.controllers;
// rename folders to lowercase
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.warehouseinventoryapi.models.Branch;
import com.skillstorm.warehouseinventoryapi.services.BranchService;

import jakarta.validation.Valid;
// import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/locations")
public class BranchController {

    
    private BranchService branchService;

    // @Autowired
    public BranchController(BranchService branchservice){ // no autowired needed
        this.branchService = branchservice; 
    }

    // returns the different branch locations
    @GetMapping("/locations") // get method converts list to JSON
    public List<Branch> getAllBranches(@RequestParam(required = false) String param) {
        return branchService.getAllBranches();

    }

    // GET request to return branches by ID and display data
    @GetMapping("/{id}")
    public Branch branchData(String id) {
        return branchService.getBranchData(id);
    }

    // POST request to add new branches

    @PostMapping("path")
    @ResponseStatus(code = HttpStatus.CREATED) // why this?
    public Branch createBranch(@Valid @RequestBody Branch branch) {
        
        return branch; // return type needs to return branch data
    }
// DELETE reqeust to remove Branch by ID
     @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK) // what needs to be fixed - not on Ericas code?
    public Branch deleteBranch(@PathVariable Branch id) { // can I do it this way or need to be an int?
        return null; // return list of current Branches
    }


    

}
