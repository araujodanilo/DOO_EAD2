package Messages;

public class MessageLogLevelINFO extends AbstractMessageLOG{
    @Override
    void sendMessageLog(String message) {
        System.out.println(message);
    }
}
