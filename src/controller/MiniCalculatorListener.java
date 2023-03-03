package controller;

import view.MiniCalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiniCalculatorListener implements ActionListener {
    private MiniCalculatorView miniCalculatorView;

    public MiniCalculatorListener(MiniCalculatorView miniCalculatorView) {
        this.miniCalculatorView = miniCalculatorView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if(src.equalsIgnoreCase("+")){
            this.miniCalculatorView.cong();
        }else if(src.equalsIgnoreCase("-")) {
            this.miniCalculatorView.tru();
        }else if(src.equalsIgnoreCase("*")) {
            this.miniCalculatorView.nhan();
        }else if(src.equalsIgnoreCase("/")) {
            this.miniCalculatorView.chia();
        }else if(src.equalsIgnoreCase("^")) {
            this.miniCalculatorView.pow();
        }else if(src.equalsIgnoreCase("%")) {
            this.miniCalculatorView.du();
        }else if(src.equalsIgnoreCase("Reset")){

        }
    }
}
