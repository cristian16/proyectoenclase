
package app2;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame {

    JPanel p = new JPanel();
    JLabel l = new JLabel("Juguemos!!!! Escoge lo que quieres adivinar");
    JButton b = new JButton("Chequear");
    JTextField t = new JTextField(10);
    VentanaResultado q;
    JComboBox cb;

    public VentanaPrincipal() {
        super("Ventana Principal");
        setLocation(500, 300);
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        agregarComponentes();
        pack();
    }

    public void agregarComponentes() {
        getContentPane().add(p);
        p.setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();
        g.gridx = 0;
        g.gridy = 0;
        g.insets = new Insets(10, 10, 10, 10);

        p.add(l, g);
        g.gridy = 1;
        p.add(t, g);
        Vector v = new Vector(4);
        v.addElement("Numero de la semana");
        v.addElement("Dia del año");
        v.addElement("Mes del Año");
        v.addElement("Dia de la Semana");
        cb = new JComboBox(v);
        g.gridx = 1;
        p.add(cb, g);
        g.gridy = 2;
        g.gridx = 0;
        p.add(b, g);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (!t.getText().isEmpty()) {
                    chequear();
                } else {
                    JOptionPane.showMessageDialog(null, "insertar texto para empesar a jugar");
                }
            }
        });

    }

    public void chequear() {
        switch (cb.getSelectedIndex()) {
            case 0:
                try {
                    int text = Integer.parseInt(t.getText());
                    Calendar c = Calendar.getInstance();
                    int ca = c.get(Calendar.WEEK_OF_YEAR);
                    if (text == ca) {
                        q = new VentanaResultado();
                        q.lr.setText("Correcto");
                        q.lr.setForeground(Color.GREEN);
                        q.br.setText("Terminar");
                    } else {
                        q = new VentanaResultado();
                        q.lr.setText("Incorrecto");
                        q.lr.setForeground(Color.red);
                        q.br.setText("intenta de nuevo");
                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese numeros enteros para jugar");
                }
                break;
            case 1:
                try {
                    int text = Integer.parseInt(t.getText());
                    Calendar c = Calendar.getInstance();
                    int ca = c.get(Calendar.DAY_OF_YEAR);
                    if (text == ca) {
                        q = new VentanaResultado();
                        q.lr.setText("Correcto");
                        q.lr.setForeground(Color.GREEN);
                        q.br.setText("Terminar");
                    } else {
                        q = new VentanaResultado();
                        q.lr.setText("Incorrecto");
                        q.lr.setForeground(Color.red);
                        q.br.setText("intenta de nuevo");
                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese numeros enteros para jugar");
                }
                break;
            case 2:
                try {
                    int text = Integer.parseInt(t.getText());
                    Calendar c = Calendar.getInstance();
                    int ca = c.get(Calendar.MONTH);
                    if (text == 1) {
                        q = new VentanaResultado();
                        q.lr.setText("Correcto");
                        q.lr.setForeground(Color.GREEN);
                        q.br.setText("Terminar");
                    } else {
                        q = new VentanaResultado();
                        q.lr.setText("Incorrecto");
                        q.lr.setForeground(Color.red);
                        q.br.setText("intenta de nuevo");
                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese numeros enteros para jugar");
                }
                break;
            case 3:
                try {
                    int text = Integer.parseInt(t.getText());
                    Calendar c = Calendar.getInstance();
                    int ca = c.get(Calendar.DAY_OF_WEEK); //los dias de la semana corre desde el domingo como primer dia
                    if (text == ca) {
                        q = new VentanaResultado();
                        q.lr.setText("Correcto");
                        q.lr.setForeground(Color.GREEN);
                        q.br.setText("Terminar");
                    } else {
                        q = new VentanaResultado();
                        q.lr.setText("Incorrecto");
                        q.lr.setForeground(Color.red);
                        q.br.setText("intenta de nuevo");
                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese numeros enteros para jugar");
                }
                break;

        }

    }

}

