import javax.swing.*;
// import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseListener;
import java.util.Random;
// import javax.swing.Timer;
// import java.awt.Toolkit;

public class AimTraining{
    public static int score = 0;
    
    AimTraining(JFrame window, int difficulty)
    {
        Random rand = new Random();
        JLabel label = new JLabel(new ImageIcon("/home/lizasevrlstinluv/Programming/Java/Lab02-4/git.png")); //or "Text"
		label.setBounds(rand.nextInt(2560),  rand.nextInt(1440), 300, 300);
		label.setVisible(true);
        window.add(label);
        label.addMouseListener(new MouseListener() {
            @Override
			public void mouseClicked(MouseEvent e){
                score++;
                window.remove(label);
                SwingUtilities.updateComponentTreeUI(window);
            }
			public void mousePressed(MouseEvent e){}
			public void mouseReleased(MouseEvent e){}
			public void mouseEntered(MouseEvent e){}
			public void mouseExited(MouseEvent e){}
        });
    }
    
}
