package com.cybertek.implementation;

import com.cybertek.dto.RoleDTO;
import com.cybertek.dto.UserDTO;
import com.cybertek.service.UserService;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


@NoArgsConstructor
@Component
public class UserServiceImpl extends AbstractMapService<UserDTO, String> implements UserService {

    @Override
    public List<UserDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteByID(String id) {
        super.deleteByID(id);
    }

    @Override
    public void update(UserDTO object) {
        super.update(object.getUserName(),object);
    }

    @Override
    public void delete(UserDTO object) {
        super.delete(object);
    }

    @Override
    public UserDTO findByID(String id) {
        return super.findByID(id);
    }

    public UserDTO save(UserDTO object) {
        return super.save(object.getUserName(),object);
    }

}
