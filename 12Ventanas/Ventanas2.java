
import javax.swing.*;
import static java.awt.Color.white;
import static java.awt.Color.blue;
import static java.awt.Color.black;

public class Ventana2 extends JFrame {
  public JPanel panel;

  public Ventana2() {

    this.setSize(500, 300);
    setTitle("REGISRTO DE PERSONAL");
    setLocation(500, 260);
    setLocationRelativeTo(null);
    JLabel etiqueta1 = new JLabel();
    etiqueta1.setText("REGISRTO DE PERSONAL");

    iniciarComponentes();
    panel.add(etiqueta1);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

  }

  private void iniciarComponentes() {

    colocarPaneles();
    colocarEtiquetas();
    colocarBotones();

  }

  private void colocarPaneles() {

    panel = new JPanel();

    panel.setLayout(null);
    this.getContentPane().add(panel);

  }

  private void colocarEtiquetas() {
    JLabel etiqueta = new JLabel();
    etiqueta.setText("NOMBRE(S):");
    etiqueta.setBounds(15, 35, 75, 20);
    etiqueta.setOpaque(true);
    etiqueta.setForeground(black);

    // cuadro de texto
    JTextField usertext = new JTextField(20);
    usertext.setBounds(100, 35, 135, 25);
    panel.add(usertext);
    panel.add(etiqueta);

    JLabel etiqueta2 = new JLabel();
    etiqueta2.setText("APELLIDO PATERNO:");
    etiqueta2.setBounds(15, 65, 125, 25);
    etiqueta2.setOpaque(true);
    etiqueta2.setForeground(black);

    // cuadro de texto
    JTextField text = new JTextField(20);
    text.setBounds(145, 65, 135, 25);
    panel.add(text);
    panel.add(etiqueta2);

    JLabel etiqueta3 = new JLabel();
    etiqueta3.setText("APELLIDO MATERNO:");
    etiqueta3.setBounds(15, 95, 125, 25);
    etiqueta3.setOpaque(true);
    etiqueta3.setForeground(black);

    // cuadro de texto
    JTextField texto = new JTextField(20);
    texto.setBounds(145, 95, 135, 25);
    panel.add(texto);

    panel.add(etiqueta3);

    JLabel etiqueta4 = new JLabel();
    etiqueta4.setText("FECHA DE NACIMIENTO:");
    etiqueta4.setBounds(15, 125, 155, 25);
    etiqueta4.setOpaque(true);
    etiqueta4.setForeground(black);

    JLabel etiqueta10 = new JLabel();
    etiqueta10.setText("(dd/mm/aaaa):");
    etiqueta10.setBounds(285, 125, 155, 25);
    etiqueta10.setOpaque(true);
    etiqueta10.setForeground(black);

    // cuadro de texto
    JTextField texto2 = new JTextField(20);
    texto2.setBounds(175, 125, 25, 25);
    panel.add(texto2);
    panel.add(etiqueta10);

    JTextField texto8 = new JTextField(20);
    texto8.setBounds(203, 125, 25, 25);
    panel.add(texto8);
    panel.add(etiqueta10);

    JTextField texto9 = new JTextField(20);
    texto9.setBounds(232, 125, 45, 25);
    panel.add(texto9);
    panel.add(etiqueta10);

    JLabel etiqueta5 = new JLabel();
    etiqueta5.setText("USUARIO:");
    etiqueta5.setBounds(15, 155, 75, 25);
    etiqueta5.setOpaque(true);
    etiqueta5.setForeground(black);

    // cuadro de texto
    JTextField texto3 = new JTextField(20);
    texto3.setBounds(95, 155, 135, 25);
    panel.add(texto3);

    panel.add(etiqueta5);

    JLabel etiqueta6 = new JLabel();
    etiqueta6.setText("CONTRASEÑA:");
    etiqueta6.setBounds(15, 185, 105, 25);
    etiqueta6.setOpaque(true);
    etiqueta6.setForeground(black);

    // cuadro de texto
    JTextField texto4 = new JTextField(20);
    texto4.setBounds(125, 185, 135, 25);
    panel.add(texto4);

    panel.add(etiqueta6);

  }

  private void colocarBotones() {
    JButton boton1 = new JButton("REGISTRAR");
    boton1.setBounds(305, 225, 125, 35);
    boton1.setEnabled(true);
    panel.add(boton1);

  }

}
