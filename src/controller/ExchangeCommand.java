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
    
    CurrencySet set;

    public ExchangeCommand(CurrencySet set) {
        this.set = set;
    }

    public void execute() {
        Exchange ex = readExchange();
        ExchangeRate rate = readExchangeRate(ex);
        Money result = convert(ex,rate);
        displayResult(result,rate);
    }

    private Exchange readExchange() {
        return new ExchangeDialog(set).getExchange();
    }

    private ExchangeRate readExchangeRate(Exchange ex) {
        return new ExchangeRateLoader().load(ex.getMoney().getCurrency(),ex.getCurrency());
    }

    private Money convert(Exchange ex, ExchangeRate rate) {
        return Exchanger.convert(ex.getCurrency(), ex.getMoney().getAmount(), rate.getRate());
    }

    private void displayResult(Money result, ExchangeRate rate) {
        new MoneyDisplay(result, rate).display();
    }
    
    
}
