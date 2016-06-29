import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public final class GameFrame extends JFrame{
public GameFrame(){
	setTitle("Pacman");
	setLayout(new BorderLayout());
	add(new JLabel("Click the button below"), BorderLayout.NORTH);
	 final GameCanvas canvas=new GameCanvas();
	add(canvas,BorderLayout.CENTER);
	
	
	pack();
	
}
}
