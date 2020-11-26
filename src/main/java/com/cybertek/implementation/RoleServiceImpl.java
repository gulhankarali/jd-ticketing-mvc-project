package com.cybertek.implementation;

import com.cybertek.dto.RoleDTO;
import com.cybertek.dto.UserDTO;
import com.cybertek.entity.Role;
import com.cybertek.service.RoleService;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.management.relation.RoleNotFoundException;
import java.util.List;

@NoArgsConstructor
@Component
public class RoleServiceImpl extends AbstractMapService<RoleDTO,Long> implements RoleService {

    @Override
    public List<RoleDTO> findAll() {
        return super.findAll();
    }

    @Override
    public RoleDTO findByID(Long id) {
        return super.findByID(id);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteByID(id);
    }

    @Override
    public void delete(RoleDTO object) {
        super.delete(object);
    }

    @Override
    public RoleDTO save(RoleDTO object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void update(RoleDTO object) {
        super.update(object.getId(),object);
    }

}