package org.example.services;

import org.example.daos.ClientDao;

import org.example.exceptions.Entity;
import org.example.exceptions.FailedToCreateException;
import org.example.requests.ClientRequest;

import java.sql.SQLException;


public class ClientService {
    ClientDao clientDao;
    public ClientService(final ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    public int createClient(final ClientRequest clientRequest) throws
            FailedToCreateException, SQLException {
        int id = clientDao.createClient(clientRequest);

        if (id == -1) {
            throw new FailedToCreateException(Entity.CLIENT);
        }

        return id;
    }
}
