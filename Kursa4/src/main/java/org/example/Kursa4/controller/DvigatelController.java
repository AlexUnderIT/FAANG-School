package org.example.Kursa4.controller;

import org.example.Kursa4.database.entity.Catalogg;
import org.example.Kursa4.database.entity.Category;
import org.example.Kursa4.database.entity.Product;
import org.example.Kursa4.database.entity.Tag;
import org.example.Kursa4.service.CategoryService;
import org.example.Kursa4.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DvigatelController {

    private final ProductService productService;

    @Autowired
    public DvigatelController(
            ProductService productService
    ){
        this.productService = productService;
    }

    @GetMapping("/dvigatel")
    public ModelAndView ShowDvigatelPage(
            Pageable pageable
    ){
        Page<Product> tagDvigPart = productService.findAllByTag(Tag.USEFUL.name(), pageable);

        return new ModelAndView("/dvigatel")
                .addObject("dvigatels", tagDvigPart);
    }
}
