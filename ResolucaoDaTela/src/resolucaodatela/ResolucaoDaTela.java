package resolucaodatela;

import java.awt.*;

public class ResolucaoDaTela {
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução da tela desta máquina é: " + d.width + " x " + d.height);
    }
}