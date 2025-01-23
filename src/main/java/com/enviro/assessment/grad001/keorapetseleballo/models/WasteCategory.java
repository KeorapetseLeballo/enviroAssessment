package com.enviro.assessment.grad001.keorapetseleballo.models;

import jakarta.validation.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


@Table("WASTE_CATEGORY")
public class WasteCategory {

    @Id
    private Integer id;

    @NotEmpty
    private String name;

    private String description;

    private String disposalGuidelines;
    private String retrivalGuidelines;

    private String isRecyclable;
    

    public String getDisposalGuidelines() {
        return disposalGuidelines;
    }

    public void setDisposalGuidelines(String disposalGuidelines) {
        this.disposalGuidelines = disposalGuidelines;
    }

    public String getRetrivalGuidelines() {
        return retrivalGuidelines;
    }

    public void setRetrivalGuidelines(String retrivalGuidelines) {
        this.retrivalGuidelines = retrivalGuidelines;
    }

    


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String isRecyclable() {
        return isRecyclable;
    }

    public void setRecyclable(String recyclable) {
        isRecyclable = recyclable;
    }
}
