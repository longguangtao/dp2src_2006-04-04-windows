package TwoPhaseTermination.Q10_5;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class MyFrame extends JFrame implements ActionListener {
    private final JButton executeButton = new JButton("Execute");
    private final JButton cancelButton = new JButton("Cancel");

    public MyFrame() {
        super("MyFrame");
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(new JLabel("Two-Phase Termination Sample"));
        getContentPane().add(executeButton);
        getContentPane().add(cancelButton);
        executeButton.addActionListener(this);
        cancelButton.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == executeButton) {
            // 开始运行服务
            new Thread(new Runnable() {
                public void run() {
                    Service.service();
                }
            }).start();
        }

        if (e.getSource() == cancelButton) {
            // 停止服务
            Service.cancel();
        }
    }
}
