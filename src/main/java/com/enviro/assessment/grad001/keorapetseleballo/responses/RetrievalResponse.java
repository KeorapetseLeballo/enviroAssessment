package com.enviro.assessment.grad001.keorapetseleballo.responses;

public class RetrievalResponse {
    private String retrievalGuidelines;
    public RetrievalResponse(String retriavalGuidelines) {
        this.retrievalGuidelines = retriavalGuidelines;
    }

    public String getRetrievalGuidelines() {
        return retrievalGuidelines;
    }

    public void setRetrievalGuidelines(String retrievalGuidelines) {
        this.retrievalGuidelines = retrievalGuidelines;
    }
}
