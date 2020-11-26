package com.cybertek.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BaseEntity {
    private Long id;
    private LocalDateTime localDateTime;
    private Long insertUserId;
    private LocalDateTime lastLocalDateTime;
    private Long lastUpdateUserId;

}
