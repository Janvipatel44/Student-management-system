/*
 
 * and open the template in the editor.
 */

package StudentManagement.View.studentView;




import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AboutUsPanel extends JPanel
{
   private JLabel lblteam,lbl,lblname1,lblname2,lblname3,lblname4,lblcontact1,lblcontact2,lblcontact3,lblcontact4;

   public AboutUsPanel()
   {
       this.setBackground(Color.LIGHT_GRAY);
       this.setLayout(new GridLayout(5,2));

       lblteam = new JLabel("                                                                             Name Of Team Members:-");
       lbl = new JLabel("");
       lblname1 = new JLabel("  Nishi");
       lblname2 = new JLabel("  Charmi");
       lblname3 = new JLabel("  Janvi");
       lblname4 = new JLabel("  Dhruti");

       lblcontact1=new JLabel("  7600946936");
       lblcontact2=new JLabel("  9974168531");
       lblcontact3=new JLabel("  9601739976");
       lblcontact4=new JLabel("  9428541360");

       this.add(lblteam);
       this.add(lbl);
       this.add(lblname1);
       this.add(lblcontact1);
       this.add(lblname2);
       this.add(lblcontact2);
       this.add(lblname3);
       this.add(lblcontact3);
       this.add(lblname4);
       this.add(lblcontact4);
       //this.setVisible(true);

   }

  
}


