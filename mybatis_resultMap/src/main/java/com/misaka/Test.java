package com.misaka;

import com.misaka.Imp.Student_IMp;

public class Test {
    public static void main(String[] args) {
        Student_IMp student_iMp= new Student_IMp();
        student_iMp.SelectStudent().forEach(stu->{
            System.out.println(stu);
        });
    }
}
