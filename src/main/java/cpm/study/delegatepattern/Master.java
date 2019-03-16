package cpm.study.delegatepattern;

import java.util.HashMap;

public class Master {

    private static HashMap<String,IWork> delegateMachines = new HashMap<String, IWork>();

    static  {
        delegateMachines.put("cook",new CookMachine());
        delegateMachines.put("clean",new CleanMachine());
        delegateMachines.put("drive",new DriveMachine());
    }

    public void doWork(String cmd){
        delegateMachines.get(cmd).doWork();
    }

}
