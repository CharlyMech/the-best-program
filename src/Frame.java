import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {
	// ATTRIBUTES
	private JButton no = new JButton("NO");
	private JButton yes = new JButton("YES");
	private JLabel question = new JLabel();

	// CONSTRUCTOR
	public Frame() {
		// Window 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(400, 400);
		this.setTitle("The Best Program");

		// Place JLabel and JButtons
		this.no.setBounds(50, 250, 100, 50);
		this.no.addActionListener(this);
		this.yes.setBounds(250, 250, 100, 50);
		this.yes.addActionListener(this);

		this.question.setText("Are you dumb?");
		this.question.setFont(new Font("Verdana", Font.BOLD, 35));
		this.question.setBounds(50, 100, 300, 50);

		// Add components to the Frame
		this.add(this.no);
		this.add(this.yes);
		this.add(this.question);

		// Set visible
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.yes) {
			JFrame frame = new JFrame("I KNEW IT");
			JLabel label = new JLabel("I KNEW IT");
			ImageIcon icon = new ImageIcon("img/icon.jpg");

			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(400, 400);
			frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

			label.setFont(new Font("Verdana", Font.BOLD, 80));
			label.setIcon(icon);
			label.setHorizontalTextPosition(JLabel.CENTER);
			label.setVerticalTextPosition(JLabel.TOP);
			label.setIconTextGap(10);
			label.setVerticalAlignment(JLabel.CENTER); // Vertical
			label.setHorizontalAlignment(JLabel.CENTER); // Horizonatal

			frame.add(label);

			frame.setVisible(true);
			frame.pack();

			this.dispose();
		} else if (e.getSource() == this.no) {
			Integer x = (int) (Math.random() * (140 - 25 + 1) + 25); // [10,140]
			Integer y = (int) (Math.random() * (350 - 150 + 1) + 150); // [10,140]

			this.no.setBounds(x, y, 100, 50);
		}
	}

}
