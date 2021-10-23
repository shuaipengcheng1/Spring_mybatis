package com.misaka.Listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;


public class oneListen implements ServletContextAttributeListener {


    public void attributeAdded(ServletContextAttributeEvent event) {
        System.out.println("添加了值");
    }
}
