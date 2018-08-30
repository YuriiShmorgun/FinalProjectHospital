package model.dao.implement.connectionPool;

import org.apache.commons.dbcp.BasicDataSource;
import sun.net.ResourceManager;

import javax.sql.DataSource;

public class ConnectionPoolHolder {
    private static volatile DataSource dataSource;


    public static DataSource getDataSource(){

        if (dataSource == null){
            synchronized (ConnectionPoolHolder.class){
                if (dataSource == null){

                    BasicDataSource basicDataSource = new BasicDataSource();
                    basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
                    basicDataSource.setUrl("jdbc:mysql://localhost:3306/hospitaldb?characterEncoding=UTF-8");
                    basicDataSource.setUsername("root");
                    basicDataSource.setPassword("root");
                    basicDataSource.setMinIdle(5);
                    basicDataSource.setMaxIdle(10);
                    basicDataSource.setMaxOpenPreparedStatements(100);
                    dataSource=basicDataSource;
                }
            }
        }
        return dataSource;
    }

}

//?autoReconnect=true&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC"