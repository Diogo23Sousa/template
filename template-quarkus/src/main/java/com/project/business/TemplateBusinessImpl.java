package com.project.business;

import com.project.repository.TemplateRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class TemplateBusinessImpl implements TemplateBusiness{

    @Inject
    TemplateRepository templateRepository;
    @Override
    public String templateMethodMain() {
        System.out.println("Business is okay.");
        return templateRepository.templateMethodMain();
    }
}
