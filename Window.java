import javax.swing.*;
import java.awt.*;
import java.awt.Toolkit;
// import java.util.Random;
import javax.swing.Timer;
import java.awt.event.*;

public class Window extends JFrame 
{
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //screenSize
    int displayWidth = screenSize.width;
    int displayHeight = screenSize.height;
    JLabel background=new JLabel();
    Window it = this;
    Window()
    {
        super("Damn osu");

        setSize(displayWidth, displayHeight); 
        setDefaultCloseOperation(3); 
        getContentPane().setBackground(new java.awt.Color(0, 0, 0));
        setLayout(null);

        //Menu bar
        JPanel menu = new JPanel(); 
        menu.setBounds(displayWidth/2, displayHeight/2, 100, 100);
        menu.setLayout(new BoxLayout(menu, BoxLayout.PAGE_AXIS));
        menu.setVisible(true);
        menu.setBackground(Color.white);

        JButton button = new JButton("Play");
        menu.add(button);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setAlignmentY(Component.CENTER_ALIGNMENT);
        button.setSize(1000, 1000);

        PlayButton pressed = new PlayButton(button, menu, this);
        button.addActionListener(pressed);


        add(menu, BorderLayout.CENTER); 


        // background
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("/home/lizasevrlstinluv/Programming/Java/Lab02-4/Background.jpg").getImage().getScaledInstance(2560, 1440, Image.SCALE_DEFAULT));
        background.setIcon(imageIcon);
        background.setSize(displayWidth, displayHeight);
        add(background);
    
        Timer timer = new Timer(1000, new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				new AimTraining(it, 0);
				
			}
		});
		timer.start();

        setVisible(true);
    }

    public void clearBackground()
    {
        this.background.setVisible(false);
    }
}
