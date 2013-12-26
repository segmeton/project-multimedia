package ProjectMultimedia;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MinePanel extends JPanel implements MouseListener
{
    private final int WIDTH = 250;
    private final int HEIGHT = 290;

    private JLabel statusbar;
    
    public MinePanel()
    {
        //setSize(WIDTH, HEIGHT);

        statusbar = new JLabel("");
        add(statusbar, BorderLayout.SOUTH);

        add(new MineBoard(statusbar));

        //setResizable(false);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new MinePanel();
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
       
    }
    
}
