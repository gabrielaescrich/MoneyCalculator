package persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import model.Currency;
import model.ExchangeRate;

public class ExchangeRateLoader{
    
    private final Connection connection;

    public ExchangeRateLoader(Connection connection) {
        this.connection = connection;
    }
    
    public ExchangeRate load(Currency from, Currency to){
        if(from.getCode().equals(to.getCode())){
            return new ExchangeRate(from, to, 1.0d);
        }
        try{
            return processQuery(connection.createStatement().executeQuery(
                    "SELECT * FROM exchangeRate" +
                    "WHERE from =" + from.getCode() +
                    "AND to =" + to.getCode()), from, to);
        }catch(SQLException ex){
            return null;
        }
    }

    private ExchangeRate processQuery(ResultSet executeQuery, Currency from, Currency to ) throws SQLException {
        ExchangeRate ex = null;
        while( executeQuery.next()){
            ex = processExchangeRate(executeQuery, from, to);
        }
        return ex;
    }

    private ExchangeRate processExchangeRate(ResultSet executeQuery, Currency from, Currency to) throws SQLException {
        return new ExchangeRate(from, to, executeQuery.getDouble("rate"));
    }

}
