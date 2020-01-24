
package app2;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaResultado extends JFrame {
     JPanel pr = new JPanel();
    JLabel lr = new JLabel("texto");
    JButton br = new JButton("texto");
    
    
    
    public VentanaResultado(){
    super("Ventana Principal");
        setLocation(400, 200);
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        agregarComponentes();
    }
    
    public void agregarComponentes(){
        getContentPane().add(pr);
        pr.setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();
        g.gridx=0;
        g.gridy=0;
        g.insets= new Insets(10, 10, 10, 10);
        
        pr.add(lr,g);
        g.gridy=1;
        
        pr.add(br,g);
        g.gridy=3;
        
        br.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (br.getText() == "terminar"){
                    System.exit(0);
                }else{
                    dispose();
                }
            }
        });
    }

}
