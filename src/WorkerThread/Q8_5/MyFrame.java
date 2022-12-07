package WorkerThread.Q8_5;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class MyFrame extends JFrame implements ActionListener {
    private final JLabel label = new JLabel("Event Dispatching Thread Sample");
    private final JButton button = new JButton("countUp");
    public MyFrame() {
        super("MyFrame");
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(label);
        getContentPane().add(button);
        button.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            countUp();
        }

    }
    private void countUp() {

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":countUp:setText(" + i + ")");
            

           try {
            SwingUtilities.invokeAndWait(new Runnable() {

                @Override
                public void run() {
                    // TODO Auto-generated method stub
                    
                }
                
               });
        } catch (InvocationTargetException e1) {
            e1.printStackTrace();
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }

    }
}
