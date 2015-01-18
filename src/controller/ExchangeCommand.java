package controller;

import model.CurrencySet;
import model.Exchange;
import model.ExchangeRate;
import model.Money;
import persistence.ExchangeRateLoader;
import process.Exchanger;
import us.ExchangeDialog;
import us.MoneyDisplay;
 
public class ExchangeCommand {
    
    private final ExchangeDialog exchangeDialog;

    public ExchangeCommand(ExchangeDialog exchangeDialog) {
        this.exchangeDialog = exchangeDialog;
    }

    public void execute() {
        System.out.println(exchangeDialog.getExchange().getMoney().getAmount());
        System.out.println(exchangeDialog.getExchange().getMoney().getCurrency().getCode());
        System.out.println(exchangeDialog.getExchange().getCurrency().getCode());
    }
}
