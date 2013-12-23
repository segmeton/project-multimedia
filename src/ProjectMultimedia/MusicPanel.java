

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


public class MusicPanel extends JPanel implements MouseListener
{
    public MusicPanel()
    {
        setLayout(new BorderLayout());
        setBackground(Color.red);
                
        JPanel MusicPlayListPanel = new JPanel();
        MusicPlayListPanel.setLayout(new BorderLayout());
        MusicPlayListPanel.setBackground(Color.red);
                
            JList MusicPlayList = new JList();
                    
            JPanel MusicPlayListButtonPanel = new JPanel();
            MusicPlayListButtonPanel.setLayout(new FlowLayout());
            MusicPlayListButtonPanel.setBackground(Color.red);

                JButton AddList = new JButton();
                AddList.setText("Add List");
                AddList.setPreferredSize(new Dimension(120, 26));
                AddList.addMouseListener(this);

                JButton RemoveList = new JButton();
                RemoveList.setText("Remove List");
                RemoveList.setPreferredSize(new Dimension(120, 26));
                RemoveList.addMouseListener(this);
                        
            MusicPlayListButtonPanel.add(AddList);
            MusicPlayListButtonPanel.add(RemoveList);

        MusicPlayListPanel.add(MusicPlayList,BorderLayout.CENTER);
        MusicPlayListPanel.add(MusicPlayListButtonPanel,BorderLayout.SOUTH);
                
        JPanel MusicListPanel = new JPanel();
        MusicListPanel.setBackground(Color.red);
                        
            JPanel MusicButtonPanel = new JPanel();
            MusicButtonPanel.setBackground(Color.red);
                        
                JButton AddFolder = new JButton();
                AddFolder.setText("Add Folder");
                AddFolder.addMouseListener(this);

                JButton AddFiles = new JButton();
                AddFiles.setText("Add Files");
                AddFiles.addMouseListener(this);

                JButton PlayAll = new JButton();
                PlayAll.setText("Play All");
                PlayAll.addMouseListener(this);

                JButton PauseAll = new JButton();
                PauseAll.setText("Pause All");
                PauseAll.addMouseListener(this);

                JButton StopAll = new JButton();
                StopAll.setText("Stop All");
                StopAll.addMouseListener(this);
                       
            MusicButtonPanel.add(AddFolder);
            MusicButtonPanel.add(AddFiles);
            MusicButtonPanel.add(PlayAll);
            MusicButtonPanel.add(PauseAll);
            MusicButtonPanel.add(StopAll);
                        
            JList MusicList = new JList();
            MusicList.setPreferredSize(new Dimension(515, 485));
            MusicList.setBackground(Color.black);
            MusicList.setForeground(Color.white);
                    
        MusicListPanel.add(MusicButtonPanel,BorderLayout.NORTH);
        MusicListPanel.add(MusicList,BorderLayout.CENTER);    

        add(MusicPlayListPanel,BorderLayout.WEST);
        add(MusicListPanel,BorderLayout.CENTER);
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
