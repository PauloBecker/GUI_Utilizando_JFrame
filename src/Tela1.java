import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class Tela1{

	public Tela1() {

		//Criando Botão, Label e campo para texto com Swing
		JFrame frame = new JFrame("Título da tela");
		frame.setVisible(true);
		frame.setSize(400, 340);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		JTextField textField = new JTextField(10);
		frame.add(textField);
	
		JLabel label = new JLabel("Texto");
		frame.add(label);

		JButton button = new JButton("Executar");
		frame .add(button);
	}
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {

			new Tela1();
			
			}
		});
	}

}
