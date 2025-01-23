package com.enviro.assessment.grad001.keorapetseleballo.repository;

import com.enviro.assessment.grad001.keorapetseleballo.models.WasteCategory;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CategoryRepository extends CrudRepository<WasteCategory, Integer> {

}
