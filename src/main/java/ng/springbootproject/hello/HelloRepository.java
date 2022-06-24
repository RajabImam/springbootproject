/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ng.springbootproject.hello;

/**
 *
 * @author RAJAB IMAM
 */
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Map<String, Object> findById(String id) {
        // SELECT statement
        String query = "SELECT *"
                + " FROM employee"
                + " WHERE id=?";
        // Search execution
        Map<String, Object> employee = jdbcTemplate.queryForMap(query, id);
        return employee;
    }
}
