package com.skillstorm.warehouseinventoryapi.Services;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import com.skillstorm.warehouseinventoryapi.Models.Branch;
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

@Service
public class BranchService {

    // instance to return list of all branches
    private List<Branch> branches = Arrays.asList(
            new Branch(01, "Doylestown"),
            new Branch(02, "N. Wales"),
            new Branch(03, "Edgemont"),
            new Branch(04, "Philadelphia"));

    // method to return list of branches
    public List<Branch> getAllBranches() {
        return branches;
    }

    // instance to return list of branch data by id
    private List<Branch> branchData = Arrays.asList(
            new Branch(01, "Doylestown","Jordan Terry", "Main Street", "12", 10000),
            new Branch(02, "N. Wales","Andy Miller", "Dickerson Road", "15", 15000),
            new Branch(03, "Edgemont","Rich Baruffi", "Rt 202", "8", 10000),
            new Branch(04, "Philadelphia","Bill Hall", "Street Road", "8", 8000));

    // method to return Branch data
    public List<Branch> getAllBranchData() {
        return branchData;
    }

    // // logic to return branch details based on ID
    // public void getBranch(List<Branch> branches, String id){
    // for (Branch branch : branches) {
    // if (branch.getName() == id) {
    // return;
    // // how to return individual branch from id?
    // }
    // }
    public Branch getBranchData(String id) { // may need to change storeNum from int to string or get() different
                                             // variable
        return branchData.stream().filter(t -> t.getName().equals(id)).findFirst().get();
    }
}
