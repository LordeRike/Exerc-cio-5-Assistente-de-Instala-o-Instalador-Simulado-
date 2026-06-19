import javax.swing.*;
import java.awt.*;

public class AssistenteInstalacao extends JFrame {

    public AssistenteInstalacao() {
        setTitle("Instalador v1.0");
        setSize(400,150);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JLabel lblMensagem = new JLabel("Pronto para iniciar a cópia de arquivos para o disco rígido");
        JButton bntAcao = new JButton("Avançar >");

        add(lblMensagem);
        add(bntAcao);

        bntAcao.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Extraindo pacotes de instalação...");
        });
    }

    public static void main(String[] args) {
        AssistenteInstalacao install = new AssistenteInstalacao();
        install.setVisible(true);
    }
    
}
