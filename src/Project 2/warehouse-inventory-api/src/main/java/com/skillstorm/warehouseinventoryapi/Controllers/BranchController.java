// this controller is used for GET requests in order to display the different Branch locations
// fix GET warehouse ID for Warehouse data
// add PUT method to create new Branch

package com.skillstorm.warehouseinventoryapi.Controllers;

import org.springframework.web.bind.annotation.RestController;
import com.skillstorm.warehouseinventoryapi.Models.Branch;
import com.skillstorm.warehouseinventoryapi.Services.BranchService;
// import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

@RestController
@RequestMapping("/locations")
public class BranchController {

    @Autowired // dependency injection
    private BranchService branchService;

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

    // PUT request to add new branches

}
