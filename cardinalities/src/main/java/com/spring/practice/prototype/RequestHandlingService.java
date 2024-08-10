package com.spring.practice.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestHandlingService {

    @Autowired
    private RequestIdentifierService requestIdentifierService;

    public String handleRequest() {
        // Use the prototype-scoped bean to get a unique identifier for this request
        String requestId = requestIdentifierService.getRequestId();
        return "Handling request with ID: " + requestId;
    }
}