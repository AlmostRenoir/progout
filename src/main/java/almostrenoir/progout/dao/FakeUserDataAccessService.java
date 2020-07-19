package almostrenoir.progout.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import almostrenoir.progout.model.User;

@Repository("fakeUserDao")
public class FakeUserDataAccessService implements UserDao {

  private static List<User> DB = new ArrayList<>();

  @Override
  public int insertUser(UUID id, User user) {
    DB.add(new User(id, user.getName()));
    return 1;
  }
  
}