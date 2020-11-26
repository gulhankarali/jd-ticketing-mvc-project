package com.cybertek.controller;

import com.cybertek.dto.ProjectDTO;
import com.cybertek.service.ProjectService;
import com.cybertek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Component
@RequestMapping("/project")
public class ProjectController {

    ProjectService projectService;
    UserService userService;


    @Autowired
    ProjectController(ProjectService projectService, UserService userService){
        this.projectService = projectService;
        this.userService = userService;
    }

    @GetMapping({"/create"})
    public String createProject(Model model) {
        model.addAttribute("project", new ProjectDTO());
        model.addAttribute("projectList", projectService.findAll());
        model.addAttribute("userList", userService.findAll());
        return "project/create";
    }

    @PostMapping("/create")
    public String postProject(@ModelAttribute("project") ProjectDTO project) {
        projectService.save(project);
        return "redirect:/project/create";
    }


    @GetMapping("/create/delete/{id}")
    public String deleteproject(@PathVariable("id") String id, Model model) {
        projectService.deleteByID(id);
        model.addAttribute("project", new ProjectDTO());
        model.addAttribute("projectList", projectService.findAll());
        model.addAttribute("userList", userService.findAll());
        return "project/create";
    }
}
