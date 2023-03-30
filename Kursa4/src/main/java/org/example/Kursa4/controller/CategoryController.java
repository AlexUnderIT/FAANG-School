package org.example.Kursa4.controller;

import org.example.Kursa4.database.entity.Category;
import org.example.Kursa4.database.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/get")
    public String ShowGetPage(){
        return "get";
    }

    @GetMapping ("showCategory")
    public ModelAndView showCategory(Model model){

        List<Category> categories = (List<Category>) this.categoryRepository.findAll();
        Map<String,Object> params = new HashMap<>();
        params.put("categories", categories);
        return new ModelAndView("showCategory", params);
    }

    @PostMapping("/postCategory")
    public String createCategory(@RequestParam("name") String name,
                                 @RequestParam("car_part") String car_part,
                                 @RequestParam("description") String description,
                                 @RequestParam("html") String html
                                 ){
        Category category = new Category();
        category.setName(name);
        category.setPart(car_part);
        category.setDescription(description);
        category.setHtml(html);
        categoryRepository.save(category);
        return "get";
    }

    /*@DeleteMapping("/deleteCategory")
    public String deleteCategory(@RequestParam("id") Long id){
        this.categoryRepository.deleteById(id);
        return "get";
    }*/
}