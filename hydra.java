import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class hydra{
		static String[] agrs;
		static int count=0;

	public static void main(String[] args){
		Random rand = new Random();
		JFrame frame;
		if (count==0){
		frame = new JFrame("Hydra");
		count++;
		}
		else{
		frame = new JFrame("Hydra #" + count);
		count++;
		}
		frame.setSize(200, 200);
		
frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)size.getWidth();
		int height = (int)size.getHeight();
		frame.setLocation(rand.nextInt(width-200),rand.nextInt(height-200));
//idea from : https://stackoverflow.com/questions/12210972/setdefaultcloseoperation-to-show-a-jframe-instead
		frame.addWindowListener(new WindowAdapter(){

		@Override
		public void windowClosing(WindowEvent e){
			//JFrame frame2 = frame;
			//frame2.setVisible(true);
			main(agrs);
			main(agrs);
			frame.dispose();
		}
		});


		frame.setVisible(true);
	}
}
