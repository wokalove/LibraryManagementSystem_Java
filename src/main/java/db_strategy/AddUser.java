package db_strategy;

import javateam.DataSqliteController;
import java.util.Vector;

public class AddUser implements Operation{
    @Override
    public Vector<Object> doOperation(String...str){

        DataSqliteController database = new DataSqliteController();
        Vector<Object> result = new Vector<>();
        String login = str[0];
        String password = str[1];

        String command = "INSERT INTO user (login, password, access) VALUES ('" + login +"', '" + password + "', 0);";
        result.add(database.data_command(command));

        database.close();

        return result;
    }
}