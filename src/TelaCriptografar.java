import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TelaCriptografar extends JFrame {

	private JPanel contentPane;
	private JTextField txtMensagem;
	private JTextField txtChave;
	private JTextField txtCriptografado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCriptografar frame = new TelaCriptografar();
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
	public TelaCriptografar() {
		setTitle("Criptografar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtMensagem = new JTextField();

		txtMensagem.setBounds(12, 36, 512, 51);
		contentPane.add(txtMensagem);
		txtMensagem.setColumns(10);

		JLabel lblTextoParaCripitografia = new JLabel("Texto para Criptografia:");
		lblTextoParaCripitografia.setForeground(Color.BLACK);
		lblTextoParaCripitografia.setBounds(12, 13, 155, 24);
		contentPane.add(lblTextoParaCripitografia);

		txtChave = new JTextField();
		txtChave.setBounds(12, 121, 512, 22);
		contentPane.add(txtChave);
		txtChave.setColumns(10);

		JLabel lblChaveDeCripitografia = new JLabel("Chave de Criptografia:");
		lblChaveDeCripitografia.setBounds(12, 100, 136, 16);
		contentPane.add(lblChaveDeCripitografia);

		JLabel lblTextoCripitografado = new JLabel("Texto Criptografado:");
		lblTextoCripitografado.setBounds(12, 156, 136, 16);
		contentPane.add(lblTextoCripitografado);

		txtCriptografado = new JTextField();
		txtCriptografado.setBounds(12, 185, 512, 55);
		contentPane.add(txtCriptografado);
		txtCriptografado.setColumns(10);

		JButton btnCriptografar = new JButton("Criptografar");

		btnCriptografar.setBounds(12, 253, 142, 25);
		contentPane.add(btnCriptografar);

		JButton btnDescriptografar = new JButton("Descriptografar");
		btnDescriptografar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaDescriptografar tela = new TelaDescriptografar();
				tela.NovaTela();
			}
		});
		btnDescriptografar.setBounds(12, 291, 142, 25);
		contentPane.add(btnDescriptografar);

		btnCriptografar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CifraDeVinegere cv = new CifraDeVinegere(txtMensagem.getText(), txtChave.getText());
				txtCriptografado.setText(cv.cifrar());
				JOptionPane.showMessageDialog(null, "Copie o texto cliptografado e clique em Descriptografar",
						"Campo vazio", JOptionPane.INFORMATION_MESSAGE);

			}
		});
	}
}
