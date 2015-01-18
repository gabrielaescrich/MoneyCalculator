package application;

import Swing.AppFrame;
import controller.ExchangeCommand;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.CurrencySet;
import persistence.CurrencySetLoader;

public class Application {
    
 
    public static void main(String[] args) {
        ExchangeCommand exchange = new ExchangeCommand(null);
        exchange.execute();
    }
}
