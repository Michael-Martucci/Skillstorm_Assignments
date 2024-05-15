package com.skillstorm.warehouseinventoryapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.skillstorm.warehouseinventoryapi.models.Branch;
import com.skillstorm.warehouseinventoryapi.repos.BranchRepo;


 // make transactional?



@Service
public class BranchService {

      private BranchRepo repo;

    // @Autowired // ?
    public BranchService(BranchRepo repo) {
        this.repo = repo;
    }

    
    public List<Branch> findAll() {
        return repo.findAll(); // return all branches
    }

    public List<Branch> findByName(String name) {
        return repo.findByName(name); // return branch name and number
    }

    public Optional<Branch> findbyId(int id) { // added optional util
        return repo.findById(id); // returns Branch data by ID
    }

    public Branch create(Branch newBranch) { // needs authorization permissions - super user
        return newBranch; // returns newly created branch (name and ID)
    }

  public Branch update(int id, Branch product) {
        Optional<Branch> currentItem = repo.findById(id); // add logic to update fields
        return repo.save(currentItem); // returns updated branch
    }
    public void deleteById(int id) { // removes branch by ID
        // check if ID exists and throw exception
        // ideally perhaps return a list of current branches to confirm
        repo.deleteById(id);
    }
   
}
