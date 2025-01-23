package com.enviro.assessment.grad001.keorapetseleballo.services;

import com.enviro.assessment.grad001.keorapetseleballo.exceptions.ResourceNotFoundException;
import com.enviro.assessment.grad001.keorapetseleballo.models.WasteCategory;
import com.enviro.assessment.grad001.keorapetseleballo.repository.CategoryRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ManagementService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Iterable<WasteCategory> getAllCategories() {
        return categoryRepository.findAll();
    }

    public WasteCategory getCategoryById(Integer id) throws Exception {
        return categoryRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Category with ID " + id + " not found"));
    }

    public ResponseEntity<WasteCategory> createCategory(WasteCategory wasteCategory) {
        WasteCategory createdCategory = categoryRepository.save(wasteCategory);
        return ResponseEntity.status(201).body(createdCategory);
    }

    public ResponseEntity<Void> deleteCategory(Integer id) {
        if (categoryRepository.existsById(id)) {
            categoryRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.status(404).build();
    }

    public ResponseEntity<WasteCategory> updateRetrieval(Integer id, WasteCategory updated) {
      if (categoryRepository.existsById(id)) {
         WasteCategory category = categoryRepository.findById(id).orElseThrow(null);
         category.setRetrivalGuidelines(updated.getRetrivalGuidelines());
         WasteCategory changed = categoryRepository.save(category);

         return ResponseEntity.status(201).body(changed);
      }

      return ResponseEntity.status(404).build();

    }

    public ResponseEntity<WasteCategory> updateDisposal(Integer id, WasteCategory updated) {
      if (categoryRepository.existsById(id)) {
         WasteCategory category = categoryRepository.findById(id).orElseThrow(null);
         category.setDisposalGuidelines(updated.getDisposalGuidelines());
         WasteCategory changed = categoryRepository.save(category);

         return ResponseEntity.status(201).body(changed);
      }

      return ResponseEntity.status(404).build();

    }

  
}

