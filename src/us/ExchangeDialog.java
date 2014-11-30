package us;

import java.util.Scanner;
import model.Currency;
import model.CurrencySet;
import model.Exchange;
import model.Money;

public class ExchangeDialog {

    private final CurrencySet set;
    Exchange ex;
    
    public ExchangeDialog(CurrencySet set) {
        this.set = set;
        ex = new Exchange(new Money(readCurrency("origen"), readAmount()),readCurrency("destino"));
    }

    private Currency readCurrency(String x) {
        System.out.println("Elegir divisa " + x + ": ");
        showCurrencies(set);
        Scanner string = new Scanner(System.in);
        
        while(true){
            String e = string.nextLine();
            Currency available = set.getCurrency(e);
            if(available != null){
                return available;
            } 
            System.out.println("Divisa no válida. Intruduzca otra");
        }
    }
    
    private float readAmount() {
        System.out.println("Introduzca la cuantía que desea cambiar: ");
        Scanner quantity = new Scanner(System.in);
        return quantity.nextFloat();        
    }

    private void showCurrencies(CurrencySet set) {
        int i = 0;
        for (Currency currency : set.getSet()){
            System.out.println(currency.toString() +" (" + i++ + ") ");
        }
    }

    public Exchange getExchange() {
        return ex;
    }
    
}