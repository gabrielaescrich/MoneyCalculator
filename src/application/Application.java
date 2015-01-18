package application;

import Swing.AppFrame;
import controller.ExchangeCommand;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.CurrencySet;
import persistence.CurrencySetLoader;
import sqlite.SqliteCurrencySetLoader;

public class Application {
    
    public static void main(String[] args) {
        CurrencySet set = new SqliteCurrencySetLoader().load();
        AppFrame frame = new AppFrame(set.getCurrencies());
        frame.register(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new ExchangeCommand(frame.getExchangeDialog().execute());
            }
        });
    }
}
