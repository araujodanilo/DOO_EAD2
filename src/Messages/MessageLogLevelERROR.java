package Messages;

public class MessageLogLevelERROR extends AbstractMessageLOG{
    @Override
    void sendMessageLog(String message) {
        System.out.println("Error messagem: " + message);
    }
}
