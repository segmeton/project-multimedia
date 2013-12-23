package ProjectMultimedia;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class ProjectMultimedia extends JFrame implements ActionListener
{
    public ProjectMultimedia()
    {
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JTabbedPane TabPane = new JTabbedPane(); 

        TabPane.addTab("Music Player", new MusicPanel());
        TabPane.addTab("Video Player", new VideoPanel());
        TabPane.addTab("MineSweeper", new MinePanel());
        TabPane.addTab("XO Games", new XoPanel());
        TabPane.addTab("About", new AboutPanel());
        
        add(TabPane);    
    }
           
    public static void main(String[] args) 
    {
        new ProjectMultimedia().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource().equals(e))
        {}
    }
    
}
