package almostrenoir.progout.service;

import almostrenoir.progout.dao.UserDao;
import almostrenoir.progout.model.User;

public class UserService {
  
  private final UserDao userDao;

  public UserService(UserDao userDao) {
    this.userDao = userDao;
  }

  public int addUser(User user) {
    return userDao.insertUser(user);
  }

}