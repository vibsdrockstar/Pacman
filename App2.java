import java.awt.EventQueue;

import javax.swing.JFrame;

public class App2 {
	public static void main(final String[] arguments){
		System.out.println("Starting...(thread:"+Thread.currentThread()+")");
		//
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				System.out.println("Creating GUI...(thread"+Thread.currentThread()+")");
				final GameFrame frame=new GameFrame();
				frame.setVisible(true);
			}
			});
}
}