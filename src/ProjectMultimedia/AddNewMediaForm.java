package ProjectMultimedia;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AddNewMediaForm extends JFrame implements MouseListener
{
    public AddNewMediaForm()
    {
        setSize(300,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel FormPanel = new JPanel();
        FormPanel.setLayout(new BorderLayout());
        FormPanel.setBackground(Color.red);
            
            JLabel FormTitle = new JLabel();
            FormTitle.setText("Add New Media List");
            
            JPanel FormContentPanel = new JPanel();
            FormContentPanel.setLayout(new FlowLayout());
            FormContentPanel.setBackground(Color.red);
            
            JLabel Message = new JLabel();
            String s = "";
            Message.setText(s);
            
            JPanel FormButtonPanel = new JPanel();
            FormButtonPanel.setBackground(Color.red);
            
                JButton Add = new JButton();
                Add.setText("Add");
                Add.addMouseListener(this);
                
                JButton Reset = new JButton();
                Reset.setText("Reset");
                Reset.addMouseListener(this);
                
                JButton Close = new JButton();
                Close.setText("Add");
                Close.addMouseListener(this);
                
            FormButtonPanel.add(Add);
            FormButtonPanel.add(Reset);
            FormButtonPanel.add(Close);
            
            FormPanel.add(FormTitle,BorderLayout.NORTH);
            FormPanel.add(FormContentPanel,BorderLayout.CENTER);
            FormPanel.add(Message,BorderLayout.SOUTH);
            FormPanel.add(FormButtonPanel,BorderLayout.SOUTH);
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
