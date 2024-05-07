// this controller is used for GET requests in order to display the different Branch locations
// need a GET warehouse ID for Warehouse data



package com.skillstorm.warehouseinventoryapi.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.warehouseinventoryapi.Models.Branch;
import com.skillstorm.warehouseinventoryapi.Services.BranchService;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class BranchController {

    @Autowired
    private BranchService branchService;

    @GetMapping("/locations") // get method converts list to JSON
    public List<Branch> getAllBranches(@RequestParam String param) { // returns the different branch locations
        return BranchService.getAllBranches();
        // return Arrays.asList(
        //     new Branch("Doylestown", 01, "Main Street"),
        //     new Branch("N. Wales", 02, "Dickerson Road"),
        //     new Branch("Edgemont", 03, "Rt 202"),
        //     new Branch("Philadelphia", 04, "Street Road"));


    }
    
    // public String showLocations(){ I added this and the above was auto added

    //     return null;
    // }

// GET request to return branches by ID and display data
    @GetMapping("/id")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
}
