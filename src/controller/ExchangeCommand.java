package controller;

import model.CurrencySet;
import model.Exchange;
import us.ExchangeDialog;

public class ExchangeCommand {
    
    CurrencySet set;

    public ExchangeCommand(CurrencySet set) {
        this.set = set;
    }

    public void execute() {
        Exchange ex = readExchange();
    }

    private Exchange readExchange() {
        return new ExchangeDialog(set).getExchange();
    }
    
    
}
