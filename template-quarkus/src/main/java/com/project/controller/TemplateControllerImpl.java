package com.project.controller;

import com.project.controller.TemplateController;
import com.project.service.TemplateService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class TemplateControllerImpl implements TemplateController {

    @Inject
    TemplateService templateService;

    @Override
    public String templateMethod() {
        return "Template Method is running.";
    }

    @Override
    public String templateMethodMain()  {
        System.out.println("Controller is okay.");
        return templateService.templateMethodMain();
    }
}
