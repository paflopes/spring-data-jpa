package com.phillipe.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class Hibernate {

    @Bean
    public DataSource dataSource() {
        final DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        // Conecta no servidor "localhost" e no banco de dados "carros"
        dataSource.setUrl("jdbc:postgresql://localhost:5432/carros");
        // Usando o usuário "usuario"
        dataSource.setUsername("usuario");
        // E a senha "senha"
        dataSource.setPassword("senha");

        return dataSource;
    }

    @Bean
    @Autowired
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
        LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
        Map<String, String> properties = new HashMap<>();

        // Configuração do dialeto a ser utilizado pelo Hibernate.
        properties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQL82Dialect");
        // A opção "update" cria um schema no banco de dados se não houver um.
        properties.put("hibernate.hbm2ddl.auto", "update");

        // Pacote base para procurar classes anotadas com @Entity
        // Substitui o arquivo beans.xml
        emf.setPackagesToScan("com.phillipe");
        emf.setDataSource(dataSource);
        emf.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        emf.setJpaPropertyMap(properties);
        return emf;
    }

    @Bean
    @Autowired
    public JpaTransactionManager transactionManager(EntityManagerFactory managerFactory) {
        // Cria um gerenciador de transações. Executa as transações de forma automática.
        return new JpaTransactionManager(managerFactory);
    }
}
