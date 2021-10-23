package com.misaka;

import org.springframework.stereotype.Component;


/*
* @Component 创建对象的 等同于<bean>的功能
*   属性 : value 对象的名称 也就是bean的id值
*         value就是<bean>的id 是唯一值
*   位置 : 要声明的类的上面
*   @Component(value = "Student") 等同于class文件的 <bean id="Student" class="com.misaka.Student"/>
*

 * */
@Component(value = "Student")
public class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }
}
