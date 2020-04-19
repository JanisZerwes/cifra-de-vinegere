import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class VinegereTeste extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VinegereTeste frame = new VinegereTeste();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VinegereTeste() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		textField.setBounds(12, 36, 512, 51);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblTextoParaCripitografia = new JLabel("Texto para Cripitografia");
		lblTextoParaCripitografia.setForeground(Color.BLACK);
		lblTextoParaCripitografia.setBounds(12, 13, 136, 24);
		contentPane.add(lblTextoParaCripitografia);

		textField_1 = new JTextField();
		textField_1.setBounds(12, 121, 512, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblChaveDeCripitografia = new JLabel("Chave de Cripitografia");
		lblChaveDeCripitografia.setBounds(12, 100, 136, 16);
		contentPane.add(lblChaveDeCripitografia);

		JLabel lblTextoCripitografado = new JLabel("Texto Cripitografado");
		lblTextoCripitografado.setBounds(12, 156, 136, 16);
		contentPane.add(lblTextoCripitografado);

		textField_2 = new JTextField();
		textField_2.setBounds(12, 185, 512, 55);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JButton btnCriptografar = new JButton("Criptografar");
		btnCriptografar.setBounds(148, 290, 142, 25);
		contentPane.add(btnCriptografar);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(302, 290, 97, 25);
		contentPane.add(btnLimpar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(411, 290, 97, 25);
		contentPane.add(btnCancelar);
	}
}
