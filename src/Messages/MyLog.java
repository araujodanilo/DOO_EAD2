package Messages;

public class MyLog {
    private static MyLog MYLOG;
    private static FacadeMessageLog facadeMessageLog;
    private LogLevel level;
    private MyLog() {
        facadeMessageLog = new FacadeMessageLog();
        level = LogLevel.INFO;
    }

    public static synchronized MyLog getInstance(){
        if (MYLOG == null){
            MYLOG = new MyLog();
        }
        return MYLOG;
    }

    public void log(String message, LogLevel level){
        facadeMessageLog.sendMessageLog(message, level);
    }

    public void log(String message){
        facadeMessageLog.sendMessageLog(message, level);
    }

    public void setPriority(LogLevel level) {
        this.level = level;
    }
}
