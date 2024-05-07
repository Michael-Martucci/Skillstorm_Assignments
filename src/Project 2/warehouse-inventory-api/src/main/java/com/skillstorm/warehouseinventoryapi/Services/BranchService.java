package com.skillstorm.warehouseinventoryapi.Services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.skillstorm.warehouseinventoryapi.Models.Branch;

@Service
public class BranchService {
// instance to return list of all branches
    private List<Branch> branches = Arrays.asList(
            new Branch("Doylestown", 01, "Main Street"),
            new Branch("N. Wales", 02, "Dickerson Road"),
            new Branch("Edgemont", 03, "Rt 202"),
            new Branch("Philadelphia", 04, "Street Road"));


            // method to return
            public List<Branch> getAllBranches(){
                return branches;
            }

}
