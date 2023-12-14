package com.project.service;

import com.project.business.TemplateBusiness;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class TemplateServiceImpl implements TemplateService{

    @Inject
    TemplateBusiness templateBusiness;

    @Override
    public String templateMethodMain() {
        System.out.println("Service is okay.");
        return templateBusiness.templateMethodMain();
    }
}
