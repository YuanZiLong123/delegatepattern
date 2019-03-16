package cpm.study.delegatepattern;

import org.springframework.web.servlet.DispatcherServlet;

public class CleanMachine implements IWork{
    public void doWork() {
        System.out.println("我是卧室的机器人，负责清洁");

    }
}
