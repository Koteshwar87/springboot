package com.spring.practice.prototype.correctexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")  // try with singleton here
class PrototypeScopedBean {

    private String uniqueId;

    public PrototypeScopedBean() {
        this.uniqueId = java.util.UUID.randomUUID().toString();
    }

    public String getUniqueId() {
        return uniqueId;
    }
}

@Service
public class PrototypeDependentService {

    public String processRequest(PrototypeScopedBean prototypeScopedBean) {
        return "Processed request with prototype bean: " + prototypeScopedBean.getUniqueId();
    }
}