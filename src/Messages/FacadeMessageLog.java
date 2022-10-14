package Messages;

public class FacadeMessageLog {
    private final AbstractMessageLOG messageERROR;
    private final AbstractMessageLOG messageWARNING;
    private final AbstractMessageLOG messageINFO;
    public FacadeMessageLog() {
        messageERROR = new MessageLogLevelERROR();
        messageWARNING = new MessageLogLevelWARNING();
        messageINFO = new MessageLogLevelINFO();
    }
    public void sendMessageLog(String message, LogLevel level){
        switch (level){
            case INFO -> messageINFO.sendMessageLog(message);
            case WARNING -> messageWARNING.sendMessageLog(message);
            case ERROR -> messageERROR.sendMessageLog(message);
        }
    }

}
