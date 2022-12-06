import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MesBoutons extends JButton implements ActionListener {

    public MesBoutons(){
        super();
        initBouton();
    }
    public MesBoutons(String titre) {
        super(titre);
        initBouton();
    }

    public void initBouton(){
        this.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("je suis le bouton " + this.getText() + " et je suis pressé eheh");
    }


}
