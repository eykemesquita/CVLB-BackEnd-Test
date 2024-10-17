package com.github.eykemesquita.customer_api.domain.repository;
import com.github.eykemesquita.customer_api.domain.model.Client;
import com.github.eykemesquita.customer_api.domain.repository.rowmapper.ClientRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ClientRepository {

    @Qualifier("clientDataSource")
    private DataSource clientDataSource;

    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public List<Client> getClients() throws SQLException {
        List<Client> clients = new ArrayList<>();

        String query = "SELECT * FROM client WHERE id = :id";
        SqlParameterSource sqlParameterSource = new MapSqlParameterSource().addValue("id", 1);
        clients = namedParameterJdbcTemplate.query(query, sqlParameterSource, new ClientRowMapper());
        return clients;
    }

}
