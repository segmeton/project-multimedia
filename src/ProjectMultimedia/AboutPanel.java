package ProjectMultimedia;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class AboutPanel extends JPanel
{
    Image Ori;
    Image[] ball = new Image[4];
    AffineTransform at;
        
    public AboutPanel()
    {
        setBackground(Color.black);
        setLayout(new BorderLayout());
        
        Ori = new ImageIcon("ball.png").getImage();
        for(int i=0;i<4;i++)
        {
            ball[i] = createImage( new FilteredImageSource( Ori.getSource(), new CropImageFilter( 0, i*77, 80, 77 ) ) );
        }
        at = new AffineTransform(); 
        Th.start();
        
        JPanel AboutContentPanel = new JPanel();
        AboutContentPanel.setBackground(Color.black);
                
        add(AboutContentPanel,BorderLayout.SOUTH);
    }
    
    int degree = 0;
    int index = 0;
    Thread Th = new Thread( new Runnable()
    {
        @Override
        public void run() 
        {
            while(true)
            {
                degree+=5;
                repaint();
                try 
                {
                    Thread.sleep(500);
                } 
                catch (InterruptedException ex) 
                {
                    Logger.getLogger(AboutPanel.class.getName()).log(Level.SEVERE, null, ex);
                }  
            }
        }
    }); 
    
    @Override
    public void paint(Graphics g) 
    {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        at.rotate(Math.toRadians(degree), 40, 40);
        if(degree>=360)
        {
            degree = 0;
        }
        g2d.setTransform(at);
        for(int i=0;i<4;i++)
        {
            g2d.drawImage(ball[i], 0, 0, this);
        }
    }
}
