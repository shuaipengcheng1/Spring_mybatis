package COM.PROVIDER.Service;

import COM.PROVIDER.Dao.UserDao;
import COM.PROVIDER.Domain.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class UserServiceImpl implements UserService {
//    dao对象
    @Resource
    UserDao userDao;
    @Override
    public User QueryUserById(int id) {
        return userDao.QueryUserById(id);
    }
}
