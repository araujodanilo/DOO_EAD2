package Messages;

public class MessageLogLevelWARNING extends AbstractMessageLOG{
    @Override
    void sendMessageLog(String message) {
        System.out.println("Warning message: " + message);
    }
}
