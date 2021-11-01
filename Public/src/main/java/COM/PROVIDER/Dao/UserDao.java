package COM.PROVIDER.Dao;

import COM.PROVIDER.Domain.User;

public interface UserDao {
    User QueryUserById(int id);
}
