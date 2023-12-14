package com.project.repository;

import com.project.business.TemplateBusiness;
import com.project.dao.TemplateDao;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class TemplateRepositoryImpl implements TemplateRepository{
    @Inject
    TemplateDao templateDao;
    @Override
    public String templateMethodMain() {
        System.out.println("Repository is okay.");
        return templateDao.templateMethodMain();
    }
}
