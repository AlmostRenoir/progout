package almostrenoir.progout.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import almostrenoir.progout.dao.UserDao;
import almostrenoir.progout.model.User;

@Service
public class UserService {
  
  private final UserDao userDao;

  @Autowired
  public UserService(@Qualifier("fakeUserDao") UserDao userDao) {
    this.userDao = userDao;
  }

  public int addUser(User user) {
    return userDao.insertUser(user);
  }

  public List<User> getAllUsers() {
    return userDao.selectAllUsers();
  }
}