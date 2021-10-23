package com.misaka.dao;

import com.misaka.domain.Stu;

import java.util.List;

public interface StudentDao {
//    插入
    public int Insert(Stu stu);
//    查询所有1
    public List<Stu> SelectStu();
//    查询一个集合的id
    public List<Stu> SelectList(List<Integer> list);

//    查询一个对象的集合
    public List<Stu> SelectList_Stu(List<Stu> list);
}
