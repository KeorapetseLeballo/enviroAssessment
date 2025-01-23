package com.enviro.assessment.grad001.keorapetseleballo.web;

import com.enviro.assessment.grad001.keorapetseleballo.models.WasteCategory;
import com.enviro.assessment.grad001.keorapetseleballo.responses.GuidelineResponse;
import com.enviro.assessment.grad001.keorapetseleballo.services.ManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class WasteController {


    @Autowired
    private ManagementService managementService;

    @GetMapping("/")
    public String getHello() {
        return "Hello, welcome to the waste management api by enviro";
    }

    @GetMapping("/categories")
    public Iterable<WasteCategory> getAllCategories() {
            return managementService.getAllCategories();
    }

    @GetMapping("/categories/{id}")
    public WasteCategory getCategoryById(@PathVariable Integer id) throws Exception {
        return managementService.getCategoryById(id);
    }

    @GetMapping("/categories/{id}/guidelines")
    public GuidelineResponse getDisposalById(@PathVariable Integer id) throws Exception {
        WasteCategory category = managementService.getCategoryById(id);

        if (category !=null) {
            return new GuidelineResponse(
                    category.getDisposalGuidelines()
            );
        }
        else {
            return new GuidelineResponse("Not found");
        }
    }

    @GetMapping("/categories/{id}/retrieval")
    public GuidelineResponse getRetrievalById(@PathVariable Integer id) throws Exception {
        WasteCategory category = managementService.getCategoryById(id);

        if (category !=null) {
            return new GuidelineResponse(
                    category.getRetrivalGuidelines()
            );
        }
        else {
            return new GuidelineResponse("Not found");
        }
    }

    @PostMapping("/categories")
    public ResponseEntity<WasteCategory> createCategory(@RequestBody WasteCategory wasteCategory) {
        return managementService.createCategory(wasteCategory);
    }

    @DeleteMapping("/categories/delete/{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable Integer id) {
        return managementService.deleteCategory(id);
    } 

    @PatchMapping("/categories/update/disposal/{id}")
    public ResponseEntity<WasteCategory> updateDisposal(@PathVariable Integer id, @RequestBody WasteCategory update) {
      return managementService.updateDisposal(id, update);
    }

    @PatchMapping("/categories/update/retrieval/{id}")
    public ResponseEntity<WasteCategory> updateRetrieval(@PathVariable Integer id, @RequestBody WasteCategory update) {
      return managementService.updateDisposal(id, update);
    }


}
