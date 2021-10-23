package com.misaka.Service;

import com.misaka.Dao.CommitDao;
import com.misaka.Domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//创建Service对象 到spring容器中
@Service("Commit")
public class CommitServiceImpl implements CommitService {
//    接收Dao
    @Autowired
    CommitDao commitDao;



    @Override
    public int Commit(User user) {
        return commitDao.InsertUser(user);
    }
}
