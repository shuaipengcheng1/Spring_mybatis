package 模拟jdbc本质;

import java.util.ResourceBundle;




//这里模拟的是java程序员
public class javaProgramer {
//  通过ResoureBundel获取要连接的数据库  通过反编译创建对象
public static void main(String[] args) throws Exception{
//    获取properties文件的database属性
  ResourceBundle resourceBundle =  ResourceBundle.getBundle("模拟jdbc本质.Use");
  String key=  resourceBundle.getString("Database");
//  反编译
    Class c = Class.forName("模拟jdbc本质.Mysql");
//    创建对象 并且使用多态来实现面向接口编程
    jdbc jdbc =(jdbc) c.newInstance();
    jdbc.Connection();

}
}
