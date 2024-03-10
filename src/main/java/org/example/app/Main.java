package org.example.app;

import org.example.dbConfig.MysqlDatabase;
import org.example.services.ClientService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        ClientService clientService = new ClientService(MysqlDatabase.getConnection());

        System.out.println(clientService.listAll());

        System.out.println(clientService.create("Template"));
        System.out.println(clientService.listAll());

        clientService.deleteById(3);
        System.out.println(clientService.listAll());

        System.out.println("clientService.getById(4) = " + clientService.getById(4));

        clientService.setName(4, "Example");
        System.out.println(clientService.listAll());
    }
}
