package spinnersparaentregar;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class SpinnersParaEntregar {
    
    private JTextField tf;
    private JSpinner spinner;
    private JFrame v;
    
    public static void main(String[] args) {
  new SpinnersParaEntregar();
    
    
    }
    public  SpinnersParaEntregar(){
        //v=new JFrame();
        tf = new JTextField(20);
        spinner = new JSpinner();
		spinner.setValue(30);
                
        spinner.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
                            
                            
                            tf.setText(spinner.getValue().toString());
                        }
        });
        v = new JFrame();
		v.getContentPane().setLayout(new FlowLayout());
		v.getContentPane().add(spinner);
		v.getContentPane().add(tf);
		v.pack();
		v.setVisible(true);
		v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
}
}