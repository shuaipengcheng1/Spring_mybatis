package com.misaka;

import com.misaka.Dao.UserDao;
import com.misaka.Domain.User;
import com.misaka.UserService.Impl.UserServiceImpl;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
    String[] str=    applicationContext.getBeanDefinitionNames();
        for (String item:str
             ) {
            System.out.println("容器的对象  "+item);
        }
//        获取Service对象
        UserServiceImpl userService=(UserServiceImpl) applicationContext.getBean("Service");


//        创键Service类

userService.InsetUser(new User(1,"misaka","sda2e2eaw"));
        userService.SelectUser().forEach(user -> {System.out.println(user);});
    }
}
