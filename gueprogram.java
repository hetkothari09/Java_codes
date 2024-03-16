//import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;
class gueprogram {
    public static void main (String [] args ){

        String name = JOptionPane.showInputDialog("Enter Your name : ");
        JOptionPane.showMessageDialog(null,"Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your age :"));
        JOptionPane.showMessageDialog(null,"You are "+age+" years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height : "));
        JOptionPane.showMessageDialog(null,"You are "+height+" inches tall");

        String food = JOptionPane.showInputDialog("Enter Your Favourite Food : ");
        JOptionPane.showMessageDialog(null,"Your Favourite Food is "+food);
    }
}
