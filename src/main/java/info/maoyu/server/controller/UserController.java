package info.maoyu.server.controller;

import info.maoyu.server.dao.UserMapper;
import info.maoyu.server.model.User;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserMapper userMapper;

    public UserController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @GetMapping("/all")
    @ResponseBody
    public List<User> findAllUser() {
        return this.userMapper.findAllUser();
    }

    @RequestMapping(value = "", params = "id", method = RequestMethod.GET)
    @ResponseBody
    public Object findUserById(@RequestParam("id") int id) {
        User user = this.userMapper.findUserById(id);
        return Objects.requireNonNullElse(user, "Did not find any matched user");
    }

    @RequestMapping(value = "", params = "name", method = RequestMethod.GET)
    @ResponseBody
    public Object findUserByName(@RequestParam("name") String name) {
        System.out.println(name);
        User user = this.userMapper.findUserByName(name);
        return Objects.requireNonNullElse(user, "Did not find any matched user");
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void saveUser(@Valid @RequestBody User user) {
        this.userMapper.saveUser(user);
    }

    @RequestMapping(value = "/update/password", method = RequestMethod.POST)
    public User updatePassword(@RequestBody User user) {
        System.out.print("update password");
        String password = user.getPassword();
        this.userMapper.updatePassword(password, 1);
        return this.userMapper.findUserById(1);
    }
}
