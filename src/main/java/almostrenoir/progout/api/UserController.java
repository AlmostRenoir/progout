package almostrenoir.progout.api;

import org.springframework.beans.factory.annotation.Autowired;

import almostrenoir.progout.model.User;
import almostrenoir.progout.service.UserService;

public class UserController {
  
  private final UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  public void addUser(User user) {
    userService.addUser(user);
  }
}