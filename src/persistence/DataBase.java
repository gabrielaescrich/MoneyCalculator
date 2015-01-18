package persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Currency;
import model.CurrencySet;

public class DataBase implements CurrencySetLoader{
    private final Connection connection;
    
    private final CurrencySet set = new CurrencySet();

    public DataBase(Connection connection) {
        this.connection = connection;
    }
        
    @Override
    public CurrencySet load() {
        try{
            return processQuery(connection.createStatement().executeQuery("SELECT * FROM currencys"));
        }catch(SQLException ex){
            return new CurrencySet();
        }
    }

    private CurrencySet processQuery(ResultSet executeQuery) throws SQLException {
        CurrencySet currency = new CurrencySet();
        while(executeQuery.next()){
            currency.add(processCurrency(executeQuery));
        }
        Currency euro = new Currency("Euro", "EUR", "€");
        currency.add(euro);
        return currency;
    }

    private Currency processCurrency(ResultSet executeQuery) throws SQLException{
        return new Currency(
            executeQuery.getString("name"),
            executeQuery.getString("code"),
            executeQuery.getString("symbol"));
    }
    
}
