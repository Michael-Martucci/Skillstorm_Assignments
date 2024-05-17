package com.skillstorm.warehouseinventoryapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skillstorm.warehouseinventoryapi.models.Branch;

import com.skillstorm.warehouseinventoryapi.repos.BranchRepo;




@Transactional // spring framework annotation or jakarta?
@Service
public class BranchService {

    private BranchRepo repo;


    public BranchService(BranchRepo repo) {
        this.repo = repo;
    }

    // return all branches with basic info
    public List<Branch> findAllBranches() {
        return repo.findAllBranches();
    }

    // return branch name and number
    public List<Branch> findByName(String name) {

        return repo.findByName(name); // return branch name and number
    }

    // returns Branch data by ID
    public Optional<Branch> findbyId(int id) {
        if (!repo.existsById(id))
            throw new IllegalArgumentException("No Branch with id " + id + " found"); // added optional util
        return repo.findById(id); // returns Branch data by ID
    }

    // returns newly created branch
    public Branch create(Branch newBranch) { // add authorization permissions - super user
        return repo.save(newBranch);
    }

    // returns updated branch
    public Branch update(int id, Branch branch) { // add authorization permissions - super user
        if (!repo.existsById(id))
            throw new IllegalArgumentException("No Branch with id " + id + "exists");
        Optional<Branch> updatedBranch = repo.findById(id); // add logic to update fields
        return repo.save(updatedBranch);

    }

    // Deletes branch by ID
    public void deleteById(int id) { // add authorization permissions - super user
        if (!repo.existsById(id))
            throw new IllegalArgumentException("No Branch with id " + id + "exists");
        repo.deleteById(id);
    }

}
