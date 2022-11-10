package menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ventana extends JFrame implements ActionListener {

    private JPanel mainPanel;
    private JTextField userBox;
    private JPasswordField passBox;

    // Constructor de la ventana del login.
    public Ventana() {
        this.setTitle("CALCULADORA DE TEMPERATURA - AREAS Y PERIMETROS");
        this.setSize(370, 170);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        JLabel etiqueta1 = new JLabel();
        etiqueta1.setText("CALCULADORA DE TEMPERATURA - AREAS Y PERIMETROS");

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        iniciarComponentes();

    }

    // Metodo para inicializar
    private void iniciarComponentes() {
        colocarPaneles();
        colocarBotones();
        colocarEtiquetas();

    }

    private void colocarPaneles() {
        // Panel principal
        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        this.getContentPane().add(mainPanel); // Agregamos el panel

    }

    private void colocarBotones() {

        userBox = new JTextField();
        passBox = new JPasswordField();

        // Boton de salir
        JButton registroButton = new JButton("TEMPERATURAS");
        registroButton.setBounds(110, 80, 140, 30);
        registroButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                Grados newFrame = new Grados();
                newFrame.setVisible(true);
            }

        });
        mainPanel.add(registroButton);

        JButton loginButton = new JButton("AREAS Y PERIMETROS");
        loginButton.setBounds(90, 50, 175, 25);
        mainPanel.add(loginButton);

        ActionListener userLoginButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ventana2 newFrame = new ventana2();
                newFrame.setVisible(true);

            }
        };

        loginButton.addActionListener(userLoginButton);
    }

    private void colocarEtiquetas() {

        JLabel userLabel = new JLabel("ELIJA LA OPCION DESEADA ");
        userLabel.setBounds(100, 0, 160, 50);
        mainPanel.add(userLabel);

    }

    public static void main(String[] args) {
        Ventana mainPanel = new Ventana();

        mainPanel.setVisible(true);

    }

}