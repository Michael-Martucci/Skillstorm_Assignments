package com.skillstorm.warehouseinventoryapi.services;

import java.util.Arrays;
import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.warehouseinventoryapi.models.Branch;
import com.skillstorm.warehouseinventoryapi.repos.BranchRepo;


@Service
public class BranchService {

       BranchRepo repo;

    // @Autowired // ?
    public BranchService(BranchRepo repo) {
        this.repo = repo;
    }

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
            new Branch(01, "Doylestown","Jordan Terry", "Main Street", 12, 10000),
            new Branch(02, "N. Wales","Andy Miller", "Dickerson Road", 15, 15000),
            new Branch(03, "Edgemont","Rich Baruffi", "Rt 202", 8, 10000),
            new Branch(04, "Philadelphia","Bill Hall", "Street Road", 8, 8000));

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



// call repo method on these? and make transactional?
    public Branch findbyId(int id) {
        return null; // returns Branch data by ID
    }

    public Branch findbyName(String name) {
        return null; // return branch name and number
    }

    public List<Branch>  findAll() {
        return repo.findAll(); // return all branches
    }

    public Branch create(Branch branch) {
        return branch; // returns newly created branch (name and ID)
    }

    public Branch update(Branch branch, int id) {
        return branch; // returns updated branch (name and ID)
    }

    public void deleteById(int id) { // removes branch by ID
        
    }
}
