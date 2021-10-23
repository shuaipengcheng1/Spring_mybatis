package com.misaka;

import com.misaka.domain.Stu;
import com.misaka.imp.Stu_Imp;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        插入
        Stu_Imp stu_imp  =new Stu_Imp();
//      int i=  stu_imp.Insert(new Stu("misaka","spc652324"));
//      System.out.println(i+"行");

//      搜索
//       List<Stu> list= stu_imp.SelectStu();
//        for (Stu s:list
//             ) {
//            System.out.println(s);
//        }
//    搜索一个集合的值
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
//        list1.add(4);
//        list1.add(5);
//
//        List<Stu> list3 =stu_imp.SelectList(list1);
//        for (Stu s:list3
//        ) {
//            System.out.println(s);
//        }

        List<Stu> list = new ArrayList<>();
        list.add(new Stu("misaka","password",1));
        list.add(new Stu("misaka","password",2));
        list.add(new Stu("misaka","password",3));
        list.add(new Stu("misaka","password",4));
        list.add(new Stu("misaka","password",5));
        List<Stu> list2 = stu_imp.SelectList_Stu(list);
                for (Stu s:list2
        ) {
            System.out.println(s);
        }

    }


}
