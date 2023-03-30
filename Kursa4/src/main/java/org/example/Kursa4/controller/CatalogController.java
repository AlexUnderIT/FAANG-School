package org.example.Kursa4.controller;

import org.example.Kursa4.database.entity.Catalogg;
import org.example.Kursa4.database.entity.Category;
import org.example.Kursa4.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CatalogController {


    private final CategoryService categoryService;

    @Autowired
    public CatalogController(
            CategoryService categoryService
    ){
        this.categoryService = categoryService;
    }

    @GetMapping("/catalog")
    public ModelAndView ShowCatalogPage(
            Pageable pageable
    ){
        Page<Category> frontPart = categoryService.findByPart(Catalogg.FRONT.name(), pageable);

        return new ModelAndView("/catalog")
                .addObject("catalogg", frontPart);
    }

}
