import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PremiereInterface {
    public static void main(String[] args) {
        JFrame fen = new MaFrame();
        EcouteurSouris ecouteS = new EcouteurSouris();

        JLabel jl = new JLabel("mon label");
        JLabel jl2 = new JLabel("mon label2");

        JButton jb = new MesBoutons("b1");
        JButton jb2 = new MesBoutons("b2");
        JButton jb3 = new MesBoutons("b3");

        fen.addMouseListener(ecouteS);

        Container fenCont = fen.getContentPane();
        fenCont.setLayout(new BorderLayout());

        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(1,3));
        jp.add(jb);
        jp.add(jb2);
        jp.add(jb3);

        fenCont.add(jl, BorderLayout.NORTH);
        fenCont.add(jp, BorderLayout.CENTER);
        fenCont.add(jl2, BorderLayout.SOUTH);



        fen.setVisible(true);
    }

    static class MaFrame extends JFrame implements MouseListener, ActionListener{
        public MaFrame(){
            setSize(500,300);
            setTitle("voilà une fenêtre");
            addMouseListener(
                    new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            int x = e.getX();
                            int y = e.getY();
                            System.out.println("click en " + x +","+  y);
                        }
                    }
            );

            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        }
        public void mouseClicked(MouseEvent e){
            System.out.println("souris cliquée sur la fen");
        }
        public void mousePressed(MouseEvent e){
            System.out.println("souris pressee sur la fen");
        }
        public void mouseReleased(MouseEvent e){
            System.out.println("souris relachée sur la fen");
        }
        public void mouseEntered(MouseEvent e){
            this.getContentPane().setBackground(Color.pink);
        }
        public void mouseExited(MouseEvent e){
            this.getContentPane().setBackground(Color.green);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("bonton pressé eheheh");
        }
    }

}
