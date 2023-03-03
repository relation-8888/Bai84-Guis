package view;

import controller.MiniCalculatorListener;
import model.MiniCalculatorModel;

import javax.swing.*;
import java.awt.*;

public class MiniCalculatorView extends JFrame {
    private MiniCalculatorModel miniCalculatorModel;
    private JTextField jTextField_fistValue;
    private JTextField jTextField_secoundValue;
    private JTextField jTextField_asnwer;


    public MiniCalculatorView() {
        this.miniCalculatorModel = new MiniCalculatorModel();
        this.init();
    }

    private void init() {
        this.setTitle("Mini Calculator");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        Font font = new Font("Arial", Font.BOLD, 30);

        JLabel jLabel_1 = new JLabel("1st value: ");
        jLabel_1.setFont(font);
        JLabel jLabel_2 = new JLabel("2nd value: ");
        jLabel_2.setFont(font);
        JLabel jLabel_answer = new JLabel("Answer: ");
        jLabel_answer.setFont(font);

        jTextField_fistValue = new JTextField(50);
        jTextField_fistValue.setFont(font);
        jTextField_secoundValue = new JTextField(50);
        jTextField_secoundValue.setFont(font);
        jTextField_asnwer = new JTextField(50);
        jTextField_asnwer.setFont(font);

        JPanel jPanel_input = new JPanel();
        jPanel_input.setLayout(new GridLayout(3, 2, 10, 10));
        jPanel_input.add(jLabel_1);
        jPanel_input.add(jTextField_fistValue);
        jPanel_input.add(jLabel_2);
        jPanel_input.add(jTextField_secoundValue);
        jPanel_input.add(jLabel_answer);
        jPanel_input.add(jTextField_asnwer);

        MiniCalculatorListener miniCalculatorListener = new MiniCalculatorListener(this);

        JButton jButtonReset = new JButton("Reset");
        jButtonReset.setFont(font);
        jButtonReset.addActionListener(miniCalculatorListener);

        JButton jButtonCong = new JButton("+");
        jButtonCong.setFont(font);
        jButtonCong.addActionListener(miniCalculatorListener);
        JButton jButtonTru = new JButton("-");
        jButtonTru.setFont(font);
        jButtonTru.addActionListener(miniCalculatorListener);
        JButton jButtonNhan = new JButton("*");
        jButtonNhan.setFont(font);
        jButtonNhan.addActionListener(miniCalculatorListener);
        JButton jButtonChia = new JButton("/");
        jButtonChia.setFont(font);
        jButtonChia.addActionListener(miniCalculatorListener);
        JButton jButtonPow = new JButton("^");
        jButtonPow.setFont(font);
        jButtonPow.addActionListener(miniCalculatorListener);
        JButton jButtonDu = new JButton("%");
        jButtonDu.setFont(font);
        jButtonDu.addActionListener(miniCalculatorListener);

        JPanel jPanelButton = new JPanel();
        jPanelButton.setLayout(new GridLayout(2, 3));
        jPanelButton.add(jButtonCong);
        jPanelButton.add(jButtonTru);
        jPanelButton.add(jButtonNhan);
        jPanelButton.add(jButtonChia);
        jPanelButton.add(jButtonPow);
        jPanelButton.add(jButtonDu);
        jPanelButton.add(jButtonReset);
        this.setLayout(new BorderLayout(10, 10));
        this.add(jPanel_input, BorderLayout.CENTER);
        this.add(jPanelButton, BorderLayout.SOUTH);


        this.setVisible(true);

    }

    public void cong() {
       double fistValue = Double.parseDouble(jTextField_fistValue.getText());
       double secondValue = Double.parseDouble(jTextField_secoundValue.getText());
       this.miniCalculatorModel.setFistValue(fistValue);
       this.miniCalculatorModel.setSecondValue(secondValue);
       this.miniCalculatorModel.sum();
       this.jTextField_asnwer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void tru() {
        double fistValue = Double.parseDouble(jTextField_fistValue.getText());
        double secondValue = Double.parseDouble(jTextField_secoundValue.getText());
        this.miniCalculatorModel.setFistValue(fistValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.minus();
        this.jTextField_asnwer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void nhan() {
        double fistValue = Double.parseDouble(jTextField_fistValue.getText());
        double secondValue = Double.parseDouble(jTextField_secoundValue.getText());
        this.miniCalculatorModel.setFistValue(fistValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.multiply();
        this.jTextField_asnwer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void chia() {
        double fistValue = Double.parseDouble(jTextField_fistValue.getText());
        double secondValue = Double.parseDouble(jTextField_secoundValue.getText());
        this.miniCalculatorModel.setFistValue(fistValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.divide();
        this.jTextField_asnwer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void pow() {
        double fistValue = Double.parseDouble(jTextField_fistValue.getText());
        double secondValue = Double.parseDouble(jTextField_secoundValue.getText());
        this.miniCalculatorModel.setFistValue(fistValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.pow();
        this.jTextField_asnwer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void du() {
        double fistValue = Double.parseDouble(jTextField_fistValue.getText());
        double secondValue = Double.parseDouble(jTextField_secoundValue.getText());
        this.miniCalculatorModel.setFistValue(fistValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.mod();
        this.jTextField_asnwer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

}
