package Swing;

import java.awt.FlowLayout;
import java.awt.PopupMenu;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.Currency;
import model.Exchange;
import model.Money;
import us.ExchangeDialog;

/**
 *
 * @author GABY
 */
public class ExchangeDialogPanel extends JPanel implements ExchangeDialog {
    private final Currency[] currencies;
    private double amount;
    private Currency from;
    private Currency to;
    
    public ExchangeDialogPanel(Currency[] currencies) {
        this.currencies = currencies;
        this.setLayout(new FlowLayout());
        this.add(createAmountField());
        this.add(createFromField());
        this.add(createToField());
        
    }
    
    @Override
    public Exchange getExchange() {
        return new Exchange(new Money(from, amount), to);
    }

    private JTextField createAmountField() {
        JTextField input = new JTextField();
        input.setColumns(20);
        input.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                amount = Double.parseDouble(input.getText());
            }
        });
        return input;
    }

    private JComboBox<Currency> createFromField() {
        JComboBox<Currency> combo = new JComboBox<>(currencies);
        combo.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() != ItemEvent.SELECTED) return;
                from = combo.getItemAt(combo.getSelectedIndex());
            }
        });
        return combo;
    }

    private JComboBox<Currency> createToField() {
        JComboBox<Currency> combo = new JComboBox<>(currencies);
        combo.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() != ItemEvent.SELECTED) return;
                to = combo.getItemAt(combo.getSelectedIndex());
            }
        });
        return combo;
    }
    
}
