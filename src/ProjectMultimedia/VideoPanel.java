package ProjectMultimedia;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;


public class VideoPanel extends JPanel implements MouseListener
{
    public VideoPanel()
    {
        setLayout(new BorderLayout());
        setBackground(Color.red);
                
        JPanel VideoPlayListPanel = new JPanel();
        VideoPlayListPanel.setLayout(new BorderLayout());
        VideoPlayListPanel.setBackground(Color.red);
                    
            JList VideoPlayList = new JList();
                    
            JPanel VideoPlayListButtonPanel = new JPanel();
            VideoPlayListButtonPanel.setLayout(new FlowLayout());
            VideoPlayListButtonPanel.setBackground(Color.red);

            JButton AddMovie = new JButton();
            AddMovie.setText("Add Movie");
            AddMovie.setPreferredSize(new Dimension(120, 26));
            AddMovie.addMouseListener(this);

            JButton DeleteMovie = new JButton();
            DeleteMovie.setText("DeleteMovie");
            DeleteMovie.setPreferredSize(new Dimension(120, 26));
            DeleteMovie.addMouseListener(this);
                        
            VideoPlayListButtonPanel.add(AddMovie);
            VideoPlayListButtonPanel.add(DeleteMovie);

        VideoPlayListPanel.add(VideoPlayList,BorderLayout.CENTER);
        VideoPlayListPanel.add(VideoPlayListButtonPanel,BorderLayout.SOUTH);
           
        add(VideoPlayListPanel,BorderLayout.WEST);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
