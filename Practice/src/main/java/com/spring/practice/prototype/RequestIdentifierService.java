package com.spring.practice.prototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class RequestIdentifierService {

    private String requestId;

    public RequestIdentifierService() {
        // Generate a unique identifier (e.g., UUID) for each instance
        this.requestId = java.util.UUID.randomUUID().toString();
    }

    public String getRequestId() {
//        this.requestId = java.util.UUID.randomUUID().toString();
        return requestId;
    }
}