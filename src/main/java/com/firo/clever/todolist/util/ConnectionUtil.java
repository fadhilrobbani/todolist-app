package com.firo.clever.todolist.util;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionUtil {

    private static HikariDataSource dataSource;

    static {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDriverClassName("com.mysql.cj.jdbc.Driver");
        hikariConfig.setJdbcUrl("jdbc:mysql://localhost:3306/db_todolist");
        hikariConfig.setUsername("root");
        hikariConfig.setPassword("");

        hikariConfig.setMaximumPoolSize(10);
        hikariConfig.setMinimumIdle(5);
        hikariConfig.setIdleTimeout(60_000);
        hikariConfig.setMaxLifetime(60*60_000);

        dataSource = new HikariDataSource(hikariConfig);

    }

    public static HikariDataSource getDataSource() {
        return dataSource;
    }
}
