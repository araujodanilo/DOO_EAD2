import Messages.LogLevel;
import Messages.MyLog;

public class Main {
    public static void main(String[] args) {

        // Como não entendi corrementa o que a linha seria para o programa,
        // Decidi criar um log sem o tipo da level usando um pré defindo pelo usuario.
        MyLog.getInstance().setPriority(LogLevel.WARNING);

        MyLog.getInstance().log("Mensagem de aviso", LogLevel.WARNING);

        MyLog.getInstance().log("Mensagem de erro", LogLevel.ERROR);

        // Esse log não estava na saida de exemplo mas decidi coloca-lo para realmente que está implementado.
        MyLog.getInstance().log("Mensagem", LogLevel.INFO);

        // A linha "9" definiu como aviso então ele sairá como aviso
        MyLog.getInstance().log("Messagem bônus");
    }
}