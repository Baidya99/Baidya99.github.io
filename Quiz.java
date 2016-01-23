import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Quiz implements ActionListener
{
    String[] Question = {"What is the full form of FOSS?", "What are the license(s) which come under FOSS?", "Which of these is NOT an example of FOSS?", "Which organization defines Open Source rules?", "Who was the founder of the Free Software movement?", "The advantage(s) of Open source is(are)?", "Examples of tools that help centrally manage the source code files are?", "Opposite of Open source is?", "Windows is a Open source software. True or False?", "Widely used open source softwares are:"};
    String[] Option1 = {"Full open-source software", "GPL", "Adobe Flash Player", "The Open Source Institute", "Henry Ford", "Gives Competitive Egde", "Concurrent Versions System (CVS)", "Closed source", "True", "Firefox"};
    String[] Option2 = {"Free and open-source software", "Lesser General Public License (LGPL)", "Linux", "The Open Source Committee", "Charles Pauling", "Greater penetration of the market", "Subversion (SVN)", "Proprietary software", "False", "Chromium"};
    String[] Option3 = {"Free other source software", "GNU Affero General Public License (AGPL)", "Android", "The Open Source Initiative", "Linus Torvalds", "Both (a) and (b)", "Git", "Property Software", "Half True and Half False", "Android"};
    String[] Option4 = {"Full and other source software", "All of the above", "Blender", "The Open Source Board", "Richard Stallman", "None of the above", "All of the above", "Both (a) and (b)", "None of these", "All of the above"};
    String[] Answer = {"Free and open-source software", "All of the above", "Adobe Flash Player", "The Open Source Committee", "Richard Stallman", "Both (a) and (b)", "All of the above", "Both (a) and (b)", "False", "All of the above"};
    static int Score=0, c=0;
    
    JPanel SPanel, QPanel, APanel, ScorePanel, ButtonPanel;
    JLabel QLabel, SLabel, ScoreLabel;
    JRadioButton But1, But2, But3, But4 ;
    JButton ButOK;
    
    public JPanel createQuizPane ()
    {
        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);
        
        SPanel = new JPanel();
        SPanel.setLayout(null);
        SPanel.setLocation(10, 0);
        SPanel.setSize(500, 30);
        SPanel.setBackground(Color.black);
        SPanel.setOpaque(true);
        totalGUI. add(SPanel);
        
        SLabel = new JLabel("Score :" + Score);
        SLabel.setLocation(0, 0);
        SLabel.setSize(120, 30);
        SLabel.setHorizontalAlignment(0);
        SLabel.setBackground(Color.red);
        SLabel.setForeground(Color.white);
        SLabel.setOpaque(true);
        SPanel.add(SLabel);
        
        QPanel = new JPanel();
        QPanel.setLayout(null);
        QPanel.setLocation(10, 40);
        QPanel.setSize(500, 100);
        totalGUI.add(QPanel);
        
        QLabel = new JLabel("Question: " + Question[c]);
        QLabel.setLocation(0, 0);
        QLabel.setSize(500, 100);
        QLabel.setHorizontalAlignment(0);
        QLabel.setBackground(Color.black);
        QLabel.setForeground(Color.white);
        QLabel.setOpaque(true);
        QPanel.add(QLabel);
        
        APanel = new JPanel();
        APanel.setLayout(null);
        APanel.setLocation(10, 150);
        APanel.setSize(500, 130);
        APanel.setBackground(Color.black);
        APanel.setOpaque(true);
        totalGUI.add(APanel);
        
        But1 = new JRadioButton("(a) " + Option1[c]);
        But1.setLocation(0, 0);
        But1.setSize(500, 20);
        But1.addActionListener(this);
        But1.setBackground(Color.black);
        But1.setForeground(Color.white);
        But1.setOpaque(true);
        APanel.add(But1);
        
        But2 = new JRadioButton("(b) " + Option2[c]);
        But2.setLocation(0, 30);
        But2.setSize(500, 20);
        But2.addActionListener(this);
        But2.setBackground(Color.black);
        But2.setForeground(Color.white);
        But2.setOpaque(true);
        APanel.add(But2);
        
        But3 = new JRadioButton("(c) " + Option3[c]);
        But3.setLocation(0, 60);
        But3.setSize(500, 20);
        But3.addActionListener(this);
        But3.setBackground(Color.black);
        But3.setForeground(Color.white);
        But3.setOpaque(true);
        APanel.add(But3);
        
        But4 = new JRadioButton("(d) " + Option4[c]);
        But4.setLocation(0, 90);
        But4.setSize(500, 20);
        But4.addActionListener(this);
        But4.setBackground(Color.black);
        But4.setForeground(Color.white);
        But4.setOpaque(true);
        APanel.add(But4);
        
        totalGUI.setOpaque(true);
        return totalGUI;
    }
    
    public JPanel createScorePane ()
    {
        JPanel scoreGUI = new JPanel();
        scoreGUI.setLayout(null);
        
        ScorePanel = new JPanel();
        ScorePanel.setLayout(null);
        ScorePanel.setLocation(10, 0);
        ScorePanel.setSize(250, 30);
        scoreGUI.add(ScorePanel);
        
        ScoreLabel = new JLabel("Your Score: " + Score);
        ScoreLabel.setLocation(0, 0);
        ScoreLabel.setSize(250, 30);
        ScoreLabel.setHorizontalAlignment(0);
        ScorePanel.add(ScoreLabel);
        
        ButtonPanel = new JPanel();
        ButtonPanel.setLayout(null);
        ButtonPanel.setLocation(10, 40);
        ButtonPanel.setSize(250, 30);
        scoreGUI.add(ButtonPanel);
        
        ButOK = new JButton("OK");
        ButOK.setLocation(75, 0);
        ButOK.setSize(100, 30);
        ButOK.addActionListener(this);
        ButOK.setBackground(Color.red);
        ButOK.setForeground(Color.white);
        ButOK.setOpaque(true);
        ButtonPanel.add(ButOK);
        
        scoreGUI.setOpaque(true);
        return scoreGUI;
    }
        
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == But1)
        {
            if(Option1[c].equals(Answer[c]))
            {
                Score++;
            }
            But1.setSelected(false);
        }
        else if(e.getSource() == But2)
        {
            if(Option2[c].equals(Answer[c]))
            {
                Score++;
            }
            But2.setSelected(false);
        }
        else if(e.getSource() == But3)
        {
            if(Option3[c].equals(Answer[c]))
            {
                Score++;
            }
            But3.setSelected(false);
        }
        else if(e.getSource() == But4)
        {
            if(Option4[c].equals(Answer[c]))
            {
                Score++;
            }
            But4.setSelected(false);
        }
        else if(e.getSource() == ButOK)
        {
            System.exit(0);
        }
        c++;
        if(c >= 10)
        {
            But1.setEnabled(false);
            But2.setEnabled(false);
            But3.setEnabled(false);
            But4.setEnabled(false);
            main();
        }
        else
        {
            QLabel.setText("Question: " + Question[c]);
            But1.setText("(a) " + Option1[c]);
            But2.setText("(b) " + Option2[c]);
            But3.setText("(c) " + Option3[c]);
            But4.setText("(d) " + Option4[c]);
            SLabel.setText("Score :" + Score);
        }
    }
    
    private static void createAndShowGUI() 
    {
        JFrame frame = new JFrame("Multi Choice Quiz");
        Quiz x = new Quiz();
        JFrame Sframe = new JFrame("Score");
        JFrame.setDefaultLookAndFeelDecorated(false);
        if(c<10)
        {
            frame.setContentPane(x.createQuizPane());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().setBackground(Color.black);
            frame.setLocationRelativeTo(null);
            frame.setSize(520, 320);
            frame.setVisible(true);
        }
        else
        {
            Sframe.setContentPane(x.createScorePane());
            Sframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().setBackground(Color.white);
            Sframe.setSize(290, 130);
            Sframe.setLocationRelativeTo(null);
            Sframe.setVisible(true);
        }
    }
    
    
    
    public static void main() 
    {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}