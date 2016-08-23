package tech.lukas.fromgoftolambda.command;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukas on 11.04.16.
 */
public class CommandGof {

    interface Command{
        void run();
    }

    public static class Logger implements Command{
        public final String message;

        public Logger(String message){
            this.message = message;
        }

        @Override
        public void run() {
            System.out.println("Logging " + message);
        }
    }

    public static class Filter implements Command{
        public final String message;

        public Filter(String message){
            this.message = message;
        }

        @Override
        public void run() {
            System.out.println("Filtering " + message);
        }
    }

    public static class HttpSender implements Command{
        public final String message;

        public HttpSender(String message){
            this.message = message;
        }

        @Override
        public void run() {
            System.out.println("Sending " + message);
        }
    }

    public static class Executor{
        public void execute(List<Command> tasks){
            for(Command task : tasks){
                task.run();
            }
        }
    }

    public static void main(String... args){
        List<Command> tasksList = new ArrayList<>();
        tasksList.add(new Logger("Hello World!"));
        tasksList.add(new Filter("Hello World!"));
        tasksList.add(new HttpSender("Hello World!"));

        new Executor().execute(tasksList);
    }


}
