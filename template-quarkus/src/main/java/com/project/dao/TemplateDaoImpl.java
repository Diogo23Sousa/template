package com.project.dao;


import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TemplateDaoImpl implements TemplateDao{


    @Override
    public String templateMethodMain() {
        System.out.println("Dao is okay.");
        return "All layers are injected. Ready to coordinate with Database.";
    }
}
