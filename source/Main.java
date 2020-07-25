import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener{

    Create create = new Create();
    private JRadioButton AddButton = new JRadioButton("+");
    private JRadioButton subButton = new JRadioButton("-");
    private JRadioButton multiplyButton = new JRadioButton("X");
    private JButton button = new JButton("GO");
    private  JLabel text = new JLabel(""); //
    private  JLabel text1 = new JLabel("CHECK");
    private JLabel text2 = new JLabel("DIGIT");
    private JLabel text3 = new JLabel("PAGE");
    private ButtonGroup operator = new ButtonGroup();
    private JComboBox opnd1 = new JComboBox(new String[]{"1", "2", "3"});
    private  JComboBox opnd2 = new JComboBox(new String[]{"1", "2", "3"});
    private  JComboBox page = new JComboBox(new String[]{"1", "2", "3","4","5","6","7","8","9","10"});


    Main() {

        this.setTitle("FROM YUJIN");

        text.setBounds(40,250,250,30);
        text1.setBounds(130,15,250,30);
        AddButton.setBounds(70,40,60,30);
        AddButton.addActionListener(this);
        subButton.setBounds(130,40,60,30);
        subButton.addActionListener(this);
        multiplyButton.setBounds(190,40,60,30);
        multiplyButton.addActionListener(this);

        text2.setBounds(130,80,250,30);
        opnd1.setBounds(90,110,50,25);
        opnd1.addActionListener(this);
        opnd2.setBounds(170,110,50,25);
        opnd2.addActionListener(this);

        text3.setBounds(130,140,250,30);
        page.setBounds(130, 170,50,25);
        page.addActionListener(this);

        button.setBounds(110,210,90,30);

        this.add(text);
        this.add(text1);
        this.add(AddButton);
        this.add(subButton);
        this.add(multiplyButton);

        this.add(text2);
        this.add(opnd1);
        this.add(opnd2);

        this.add(text3);
        this.add(page);


        this.add(button);


        this.setSize(330,330);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(create.first + ", " +create.second);
                if((create.first) < (create.second)){
                    text.setText("LEFT CANT BE BIGGER THEN RIGHT");
                }
                else{
                    if( create.makePage()){
                        text.setText( "                  "+ (page.getSelectedIndex()+1) +" PAGE IS CREATED ");
                    }
                    else{
                        text.setText( "                ERR");
                    }
                }
            }
        });



    }

    public static void main(String[] args)
    {
        System.out.println("hello");

        new Main();
    }


    @Override
    public void actionPerformed(ActionEvent e) {


        if( e.getSource().equals(AddButton)){
            create = new CreatePlus(opnd1.getSelectedIndex()+1,opnd2.getSelectedIndex()+1 ,
                    page.getSelectedIndex()+1);
        }
        else if( e.getSource().equals(subButton)){
            create = new CreateMinus(opnd1.getSelectedIndex()+1,opnd2.getSelectedIndex()+1,
                    page.getSelectedIndex()+1 );

        }
        else if( e.getSource().equals(multiplyButton)){
            create = new CreateMul(opnd1.getSelectedIndex()+1,opnd2.getSelectedIndex()+1,
                    page.getSelectedIndex()+1);
        }
        else if( e.getSource().equals(opnd1)){
            System.out.println(opnd1.getSelectedIndex()+1);
            create.first = opnd1.getSelectedIndex()+1;
        }
        else if( e.getSource().equals(opnd2)){
            create.second = opnd2.getSelectedIndex()+1;
        }
        else if( e.getSource().equals(page)){

            create.page = page.getSelectedIndex()+1;
        }
        else{

        }

    }
}
