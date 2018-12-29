package info.maoyu.server.controller;

import info.maoyu.server.model.User;
import info.maoyu.server.mapper.UserMapper;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserMapper userMapper;

    public UserController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @GetMapping("/all")
    public User selectByUserId() {
        return this.userMapper.selectById(1);
    }

    @GetMapping("/update")
    public User updatePassword(@RequestParam(value = "password") String password) {
        this.userMapper.updatePassword(password);
        return this.userMapper.selectById(1);
    }
}
