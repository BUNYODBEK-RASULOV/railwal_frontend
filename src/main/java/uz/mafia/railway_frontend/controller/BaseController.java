package uz.mafia.railway_frontend.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.MappedSuperclass;


@RestController
@MappedSuperclass
public interface BaseController<T> {


    public String add(Model model,@ModelAttribute T t) ;


    public String list(Model model);


    public String get(Model model, @PathVariable Long id, @ModelAttribute T t);


    public String update(Model model, @PathVariable Long id,@ModelAttribute T t);


    public String delete(Model model, @PathVariable Long id);

}
