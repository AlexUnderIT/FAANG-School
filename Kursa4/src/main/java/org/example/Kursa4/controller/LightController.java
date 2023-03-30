package org.example.Kursa4.controller;

import org.example.Kursa4.database.entity.Product;
import org.example.Kursa4.database.entity.Tag;
import org.example.Kursa4.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LightController {

    private final ProductService productService;

    @Autowired
    public LightController(
            ProductService productService
    ){
        this.productService = productService;
    }

    @GetMapping("/light")
    public ModelAndView ShowLightPage(
            Pageable pageable
    ){
        Page<Product> tagPart = productService.findAllByTag(Tag.USELESS.name(), pageable);

        return new ModelAndView("/light")
                .addObject("lights", tagPart);
    }
}