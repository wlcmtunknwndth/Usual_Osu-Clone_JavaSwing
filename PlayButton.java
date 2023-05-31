import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.event.*;

public class PlayButton implements ActionListener{
    JButton button;
    JPanel menu;
    String nick;
    Window window;
    PlayButton(JButton button, JPanel menu, Window window)
        {this.button = button; this.menu = menu; this.button.setVisible(true); this.window = window;}
    @Override
    public void actionPerformed(ActionEvent e)
    {   
        this.button.setVisible(false);
        JTextField introduction = new JTextField();
        introduction.setBounds(this.menu.getX(), this.menu.getY(), 300, 150);
        this.menu.add(introduction);
        menu.setBounds(1280, 720, 100, 100 );
        introduction.addKeyListener(new KeyListener() {

            public void keyTyped(KeyEvent e){}
            public void keyReleased(KeyEvent e){}
            public void keyPressed(KeyEvent e)
            {
                switch(e.getKeyCode())
                {
                    case KeyEvent.VK_ENTER:
                        menu.setVisible(false);
                        JLabel nick = new JLabel(introduction.getText());
                        window.add(nick);
                        window.clearBackground();
                        System.out.println(nick);
                        break;
                
                    //case ... 
                }
            }
        });



        // this.menu.setVisible(false);

    }
}
