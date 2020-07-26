package almostrenoir.progout.dao;

import java.util.List;
import java.util.UUID;

import almostrenoir.progout.model.User;

public interface UserDao {
  
  int insertUser(UUID id, User user);

  default int insertUser(User user) {
    UUID id = UUID.randomUUID();
    return insertUser(id, user);
  }

  List<User> selectAllUsers();
}