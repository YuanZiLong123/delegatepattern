package cpm.study.delegatepattern;

public class DriveMachine implements IWork {
    public void doWork() {
        System.out.println("我是驾驶的机器人，负责驾驶");
    }
}
