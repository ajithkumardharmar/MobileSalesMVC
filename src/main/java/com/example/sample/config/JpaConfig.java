//package com.example.sample.config;
//
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//@Configuration
//@EnableJpaRepositories(basePackages = {"com.example.sample.controller"})
//@EnableTransactionManagement
//public class JpaConfig {
//
//	   private Environment env;
//
//
//@Bean(name = "dataSource")
//public DataSource getDataSource() {
//    DriverManagerDataSource dataSource = new DriverManagerDataSource();
//
//    // See: datasouce-cfg.properties
//    dataSource.setDriverClassName(env.getProperty("ds.database-driver"));
//    dataSource.setUrl(env.getProperty("ds.url"));
//    dataSource.setUsername(env.getProperty("ds.username"));
//    dataSource.setPassword(env.getProperty("ds.password"));
//
//    System.out.println("## getDataSource: " + dataSource);
//
//    return dataSource;
//}
//
//@Bean(name = "transactionManager")
//public DataSourceTransactionManager getTransactionManager() {
//    DataSourceTransactionManager txManager = new DataSourceTransactionManager();
//
//    DataSource dataSource = this.getDataSource();
//    txManager.setDataSource(dataSource);
//
//    return txManager;
//} 
//
//}
