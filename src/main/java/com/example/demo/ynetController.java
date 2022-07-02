package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import static com.example.demo.TableContent.getTable;

@RestController

public class ynetController {
    @RequestMapping("/")



// ModelAndView is holding  both Model and View in the web framework

    public ModelAndView breakingNews(Model model) throws Exception {
        String table =  getTable();
        model.addAttribute("content", table);
      ModelAndView model_view = new ModelAndView();
      model_view.setViewName("index");
      return model_view;
    }
}
