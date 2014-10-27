package model;

public class Currency {
    
    private String name;
    private String code;
    private String symbol;

    public Currency(String name, String code, String symbol) {
        this.name = name;
        this.code = code;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getSymbol() {
        return symbol;
    }
    
    
}
