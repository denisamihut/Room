package nov03;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import java.util.ArrayList;


public class Main {
	private static final int SQUARE_FEET=35;
	private static final double PRICE=150;
	private static JTextField lenghtTextField;
	private static JTextField widthTextField;
	private static JTextField heightTextField;
	private static JButton calculate;
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("My first swing");
		frame.setSize(350,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel= new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		panel.setLayout(null);
		placeComponents(panel);


		calculate.addActionListener (new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				int lenght=Integer.parseInt(lenghtTextField.getText());
				int width=Integer.parseInt(widthTextField.getText());
				int height=Integer.parseInt(heightTextField.getText());
				Room room= new Room(width, lenght, height);
				
				int area=room.calculateArea();
				System.out.println("area: "+area);
				int area= getNrGaloons(area);
				double priceFinal=PRICE*nrGaloons;
				System.out.println("galon: "+nrGaloons);
				System.out.println("final price: "+priceFinal);
				
			//	System.out.println("lenght: "+lenght+" width: "+width+" height: "+height);
			}
		});

	}
	private static double getPriceFinal(int nrGaloons) {
		return PRICE*nrGaloons;
	}
	private static int getNrGaloons(int area) {
	int nrGaloons;
				if(area % SQUARE_FEET!=0)
					nrGaloons=area/SQUARE_FEET+1;
				
				else
					nrGaloons=area/SQUARE_FEET;
				return nrGaloons;
	}
	
	private static void placeComponents(JPanel panel) {
		JLabel lenghtLabel= new JLabel("Lenght");
		lenghtLabel.setBounds(10,20,80,25);
		panel.add(lenghtLabel);

		JTextField lenghtTextField= new JTextField(20);
		lenghtTextField.setBounds(100,20,165,25);
		panel.add(lenghtTextField);

		JLabel widthLabel= new JLabel("Width");
		widthLabel.setBounds(10,50,80,25);
		panel.add(widthLabel);

		JTextField widthTextField= new JTextField(20);
		widthTextField.setBounds(100,50,165,25);
		panel.add(widthTextField);

		JLabel heightLabel= new JLabel("Height");
		heightLabel.setBounds(10,80,80,25);
		panel.add(heightLabel);

		JTextField heightTextField= new JTextField(20);
		heightTextField.setBounds(100,80,165,25);
		panel.add(heightTextField);

		JButton calculate= new JButton("Calculate");
		calculate.setBounds(10,125,200,25);
		panel.add(calculate);
	}
	
}
