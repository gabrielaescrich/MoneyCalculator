package controller;

import us.ExchangeDialog;

 
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
