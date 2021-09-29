package main;

public class ApplicationLogger {

    private ApplicationLogger() {
    }

    public static ApplicationLogger instance = null;

    public static synchronized ApplicationLogger getInstance(){
        if(instance == null){
           instance = new ApplicationLogger();
        }
        return instance;

    }

    public void getMessage(String message){
        System.out.println(message);
    }


}
