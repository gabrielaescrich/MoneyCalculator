
package Swing;

import java.awt.FlowLayout;
import java.awt.PopupMenu;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.Money;
import us.MoneyDisplay;

/**
 *
 * @author GABY
 */
public class MoneyPanel extends JPanel implements MoneyDisplay{
    private Money money;
    private JTextField result;

    public MoneyPanel() {
        this.setLayout(new FlowLayout());
        this.add(createResultField(20));
        this.setVisible(true);
    }    
    
    @Override
    public void display(Money money) {
        result.setText(money.getAmount() + " " + money.getCurrency().getCode() + "(" + money.getCurrency().getSymbol() + ")");
    }

    private JTextField createResultField(int i) {
        this.result= new JTextField(i);
        this.result.setEditable(false);
        return result;
    }
}
