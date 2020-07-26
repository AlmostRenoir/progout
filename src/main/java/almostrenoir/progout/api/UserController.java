package almostrenoir.progout.api;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import almostrenoir.progout.model.User;
import almostrenoir.progout.service.UserService;

@RequestMapping("api/v1/user")
@RestController
public class UserController {
  
  private final UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping
  public void addUser(@RequestBody User user) {
    userService.addUser(user);
  }

  @GetMapping
  public List<User> getAllUsers() {
    return userService.getAllUsers();
  }

  @GetMapping(path = "{id}")
  public User getUserById(@PathVariable("id") UUID id) {
    return userService.getUserById(id)
            .orElse(null);
  }

  @DeleteMapping(path = "{id}")
  public void deleteUserById(@PathVariable("id") UUID id) {
    userService.deleteUser(id);
  }

  @PutMapping(path = "{id}")
  public void updateUser(@PathVariable("id") UUID id, @RequestBody User userToUpdate) {
    userService.updateUser(id, userToUpdate);
  }
}