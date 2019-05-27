import java.awt.Graphics;
import java.awt.Image;
 
import javax.swing.JButton;
import javax.swing.JPanel;
 
public class Panneau extends JPanel {
 
    private static final long serialVersionUID = 1L;
 
    /**
     * @param args
     */
    public static void main(String[] args) {
        new Fenetre();
 
    }
 
    private Image img;
     
    public Panneau(Image img){
        this.img = img;
        add(new JButton("Bouton1"));
        add(new JButton("Bouton2"));
    }
     
    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }
}