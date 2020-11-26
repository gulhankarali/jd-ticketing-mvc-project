package com.cybertek.entity;

import com.cybertek.enums.Status;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
public class Project extends BaseEntity{
    public Project(Long id, LocalDateTime localDateTime, Long insertUserId, LocalDateTime lastLocalDateTime,
                   Long lastUpdateUserId, String projectName, String projectCode, User assignedManager,
                   LocalDate startDate, LocalDate endDate, String projectDetail, Status status) {
        super(id, localDateTime, insertUserId, lastLocalDateTime, lastUpdateUserId);
        this.projectName = projectName;
        this.projectCode = projectCode;
        this.assignedManager = assignedManager;
        this.startDate = startDate;
        this.endDate = endDate;
        this.projectDetail = projectDetail;
        this.status = status;
    }

    private String projectName;
    private String projectCode;
    private User assignedManager;
    private LocalDate startDate;
    private LocalDate endDate;
    private String projectDetail;
    private Status status;
}
