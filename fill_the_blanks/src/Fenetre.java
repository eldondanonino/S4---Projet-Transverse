import java.awt.Dimension;
 
import javax.swing.ImageIcon;
import javax.swing.JFrame;
 
public class Fenetre extends JFrame {
	public static void main() {
     
    private static final long serialVersionUID = 1L;
     
    public Fenetre(){
        this.setContentPane(new Panneau(new ImageIcon("fond_scratch.jpg").getImage()));
        this.setSize(new Dimension(600,400));
        this.setVisible(true);
    }
 
}
}