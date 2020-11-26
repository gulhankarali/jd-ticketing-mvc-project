package com.cybertek.dto;

import com.cybertek.entity.User;
import com.cybertek.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class ProjectDTO {
    private String projectCode;
    private String projectName;
    private String startDate;
    private String endDate;
    private UserDTO assignedManager;
    private Status status;
    private String projectDetail;

}
