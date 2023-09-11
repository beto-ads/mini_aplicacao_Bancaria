package MiniBanco;

import MiniBanco.BancoExecute;
import java.io.IOException;

public class BancoExecute {
    public static void main(String[] args) {
        try {
            Menu.opcoes();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}