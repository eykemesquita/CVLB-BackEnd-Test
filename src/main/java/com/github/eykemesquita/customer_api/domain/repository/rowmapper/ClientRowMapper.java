package com.github.eykemesquita.customer_api.domain.repository.rowmapper;

import com.github.eykemesquita.customer_api.domain.model.Client;

import org.springframework.jdbc.core.RowMapper;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ClientRowMapper implements RowMapper<Client> {

//    @Override
//    public Client mapRow(ResultSet rs, int rowNum) throws SQLException {
//
//        Client client = new Client();
//        if(hasColumn(rs, "name")) {
//            client.setName(rs.getString("name"));
//        }
//        if(hasColumn(rs, "email")) {
//            client.setName(rs.getString("email"));
//        }
//        if(hasColumn(rs, "phone")) {
//            client.setName(rs.getString("phone"));
//        }
//        if(hasColumn(rs, "birthDate")) {
//            client.setName(rs.getString("birthDate"));
//        }
//
//        return client;
//    }

    @Override
    public Client mapRow(ResultSet rs, int rowNum) throws SQLException {
        Client client = new Client();
        ResultSetMetaData rsmd = rs.getMetaData();
        int columns = rsmd.getColumnCount();

        //Procurar por um campo na classe Client que corresponda ao nome da coluna do banco de dados.
        for (int x = 1; x <= columns; x++) {
            String columnName = rsmd.getColumnName(x);
            try {
                Field field = Client.class.getDeclaredField(columnName);
                field.setAccessible(true); // Torna o campo acessível se ele for privado
                field.set(client, rs.getObject(columnName));
            } catch (NoSuchFieldException | IllegalAccessException e) {
                // Ignora se o campo não existe na classe Client ou se não pode ser acessado
            }
        }

        return client;
    }

    public static boolean hasColumn(ResultSet rs, String columnName) throws SQLException {
        ResultSetMetaData rsmd = rs.getMetaData();
        int columns = rsmd.getColumnCount();
        for (int x = 1; x <= columns; x++) {
            if (columnName.equalsIgnoreCase(rsmd.getColumnName(x))) {
                return true;
            }
        }
        return false;
    }
}
