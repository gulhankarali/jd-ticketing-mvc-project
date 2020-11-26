package com.cybertek.entity;

import com.cybertek.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity {
    private String firstName;
    private String lastName;
    private boolean enabled;
    private String username;
    private String password;
    private String phone;
    private Gender gender;
    private Role role;

    public User(Long id, LocalDateTime localDateTime, Long insertUserId, LocalDateTime lastLocalDateTime,
                Long lastUpdateUserId, String firstName, String lastName, boolean enabled, String username,
                String password, String phone, Gender gender, Role role) {
        super(id, localDateTime, insertUserId, lastLocalDateTime, lastUpdateUserId);
        this.firstName = firstName;
        this.lastName = lastName;
        this.enabled = enabled;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.gender = gender;
        this.role = role;
    }

}
