package tech.lukas.fromgoftolambda.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukas on 11.04.16.
 */
public class CommandLambda {

    public static void log(String message){
        System.out.println("Logging " + message);
    }
    public static void filter(String message){
        System.out.println("Filtering " + message);
    }
    public static void httpSend(String message){
        System.out.println("Sending " + message);
    }

    public static class Executor{
        public void execute(List<Runnable> tasks){
            tasks.forEach(Runnable::run);
        }
    }

    public static void main(String... args){
        List<Runnable> taskList = new ArrayList<>();
        taskList.add(() -> log("Hello World!"));
        taskList.add(() -> filter("Hello World!"));
        taskList.add(() -> httpSend("Hello World!"));

        new Executor().execute(taskList);
    }

}
