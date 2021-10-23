package 模拟登录;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Test {


    //    用户输入用户名和密码 然后通过数据库验证 是否登录成功
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//    获取两个值
        String username = scanner.next();
//        或者是使用一个map集合 来存放数据 key value  这里选择的是 treeMap
        Map<String,String> name= new TreeMap<>();
        name.put("username",username);
//        通过Map.ectrySet() 方法将一个Map集合转为Set集合 Set集合中的元素类型为Map.Entry<K,V>
        Set<Map.Entry<String,String>> set=name.entrySet();
        for (Map.Entry<String,String> item:set
             ) {
            System.out.println("key "+item.getKey()+" value+"+item.getValue());
        }
        String password = scanner.next();
//    System.out.println(username+password);

//    调用登录
        login login = new login("jdbc:mysql://localhost:3306/vue_project", username, password);
        login.login();

    }
}
