import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaDescriptografar {

	private JFrame frmDescriptografia;
	private JTextField txtMensagemCriptografada;
	private JTextField txtChave;
	private JTextField txtTextoPronto;

	/**
	 * Launch the application.
	 */
	public static void NovaTela() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDescriptografar window = new TelaDescriptografar();
					window.frmDescriptografia.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaDescriptografar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDescriptografia = new JFrame();
		frmDescriptografia.setTitle("Descriptografia");
		frmDescriptografia.setBounds(100, 100, 641, 384);
		frmDescriptografia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDescriptografia.getContentPane().setLayout(null);

		JLabel lblTexto = new JLabel("Texto Criptografado:");
		lblTexto.setBounds(12, 13, 599, 16);
		frmDescriptografia.getContentPane().add(lblTexto);

		txtMensagemCriptografada = new JTextField();
		txtMensagemCriptografada.setText("Cole o texto aqui !!!");
		txtMensagemCriptografada.setToolTipText("");
		txtMensagemCriptografada.setBounds(12, 30, 599, 46);
		frmDescriptografia.getContentPane().add(txtMensagemCriptografada);
		txtMensagemCriptografada.setColumns(10);

		JLabel lblChave = new JLabel("Chave:");
		lblChave.setBounds(12, 90, 56, 16);
		frmDescriptografia.getContentPane().add(lblChave);

		txtChave = new JTextField();
		txtChave.setBounds(12, 106, 599, 25);
		frmDescriptografia.getContentPane().add(txtChave);
		txtChave.setColumns(10);

		JLabel lblTextoDescriptografado = new JLabel("Texto Descriptografado:");
		lblTextoDescriptografado.setBounds(12, 155, 599, 16);
		frmDescriptografia.getContentPane().add(lblTextoDescriptografado);

		txtTextoPronto = new JTextField();
		txtTextoPronto.setBounds(12, 174, 599, 46);
		frmDescriptografia.getContentPane().add(txtTextoPronto);
		txtTextoPronto.setColumns(10);

		JButton btnDescriptografar = new JButton("Descriptografar");
		btnDescriptografar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CifraDeVinegere cv = new CifraDeVinegere(txtMensagemCriptografada.getText(), txtChave.getText());
				txtTextoPronto.setText(cv.decifrar());
				JOptionPane.showMessageDialog(null, "Texto Descriptografar", "Campo vazio",
						JOptionPane.INFORMATION_MESSAGE);

			}
		});
		btnDescriptografar.setBounds(456, 276, 155, 25);
		frmDescriptografia.getContentPane().add(btnDescriptografar);
	}

}
