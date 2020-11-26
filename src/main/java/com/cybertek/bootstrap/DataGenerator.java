package com.cybertek.bootstrap;

import com.cybertek.dto.ProjectDTO;
import com.cybertek.dto.RoleDTO;
import com.cybertek.dto.UserDTO;
import com.cybertek.enums.Gender;
import com.cybertek.enums.Status;
import com.cybertek.service.ProjectService;
import com.cybertek.service.RoleService;
import com.cybertek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataGenerator implements CommandLineRunner {

    RoleService roleService;
    UserService userService;
    ProjectService projectService;

    @Autowired
    public DataGenerator(RoleService roleService, UserService userService, ProjectService projectService) {
        this.roleService = roleService;
        this.userService = userService;
        this.projectService = projectService;
    }

    @Override
    public void run(String... args) throws Exception {

        RoleDTO adminRole = new RoleDTO(1L, "Admin");
        RoleDTO managerRole = new RoleDTO(2L, "Manager");
        RoleDTO employeeRole = new RoleDTO(3L, "Employee");

        roleService.save(adminRole);
        roleService.save(managerRole);
        roleService.save(employeeRole);

        UserDTO user1 = new UserDTO("John", "Kesy",
                "admin@cybertek.com", "abc", true, "7459684532", adminRole, Gender.MALE);
        UserDTO user5 = new UserDTO("John", "Kesy",
                "admin2@cybertek.com", "abc", true, "7459684532", adminRole, Gender.MALE);
        UserDTO user2 = new UserDTO("Delisa",
                "Norre", "T001@cybertek.com", "123", true, "8567412358", managerRole, Gender.FEMALE);
        UserDTO user3 = new UserDTO("Craig", "Jark",
                "P001@cybertek.com", "123", true, "7777775566", employeeRole, Gender.MALE);
        UserDTO user4 = new UserDTO("Shaun",
                "Hayns", "S001@cybertek.com", "123", true, "3256987412", employeeRole, Gender.MALE);

        userService.save(user1);
        userService.save(user2);
        userService.save(user3);
        userService.save(user4);
        userService.save(user5);

        ProjectDTO project1 = new ProjectDTO("101PM", "Conversion Project",
                LocalDate.now().toString(), LocalDate.now().plusMonths(10).toString(), user1,Status.END,"This project about conversion of systems.");
        ProjectDTO project2 = new ProjectDTO("102PM", "Conversion Project",
                LocalDate.now().toString(), LocalDate.now().plusMonths(5).toString(), user2, Status.START, "This project about conversion of systems.");
        ProjectDTO project3 = new ProjectDTO("103PM", "Conversion Project",
                LocalDate.now().toString(), LocalDate.now().plusMonths(3).toString(), user3, Status.WIP, "This project about conversion of systems.");
        ProjectDTO project4 = new ProjectDTO("105PM", "Conversion Project",
                LocalDate.now().toString(), LocalDate.now().plusMonths(8).toString(), user4, Status.START, "This project about conversion of systems.");
        ProjectDTO project5 = new ProjectDTO("104PM", "Conversion Project",
                LocalDate.now().toString(), LocalDate.now().plusMonths(9).toString(), user5, Status.START, "This project about conversion of systems.");
        ProjectDTO project6 = new ProjectDTO("106PM", "Conversion Project",
                LocalDate.now().toString(), LocalDate.now().plusMonths(1).toString(),  user1, Status.END, "This project about conversion of systems.");

        projectService.save(project1);
        projectService.save(project2);
        projectService.save(project3);
        projectService.save(project4);
        projectService.save(project5);
        projectService.save(project6);

    }
}
