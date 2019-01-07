package info.maoyu.server.controller;

import info.maoyu.server.dao.UserMapper;
import info.maoyu.server.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserMapper userMapper;

    public UserController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @GetMapping("/all")
    public List<User> getAllUser() {
        return this.userMapper.findAll();
    }
}
