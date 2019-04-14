package unidue.ub.services.settingsbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import unidue.ub.services.settingsbackend.repositories.ElisaDataRepository;
import unidue.ub.settings.fachref.ElisaData;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ElisaController {

    private final JdbcTemplate jdbcTemplate;

    private final ElisaDataRepository elisaDataRepository;

    @Autowired
    public ElisaController(ElisaDataRepository elisaDataRepository, JdbcTemplate restTemplate) {
        this.elisaDataRepository = elisaDataRepository;
        this.jdbcTemplate = restTemplate;    }

    @GetMapping("/elisadata/forSubject/{subject}")
    public ResponseEntity<List<ElisaData>> getElisaIdForSubject(@PathVariable String subject) {
        String sql = "SELECT ed.elisa_mail as elisa_id, ed.elisa_name as elisa_name, ed.description as description, ne.priority as priority  FROM elisa_data ed, notationgroup_elisa ne WHERE ed.elisa_mail = ne.elisa_id AND ne.notationgroup_id = ?";
        return ResponseEntity.ok(getElisadata(sql, subject));
    }

    @GetMapping("/elisadata/forLibintel/{username}")
    public ResponseEntity<List<ElisaData>> getElisaIdForLibintel(@PathVariable String username) {
        String sql = "SELECT ed.elisa_mail as elisa_id, ed.elisa_name as elisa_name, ed.description as description, le.priority as priority  FROM elisa_data ed, libintel_elisa le WHERE ed.elisa_mail = le.elisa_id AND le.libintel_id = ?";
        return ResponseEntity.ok(getElisadata(sql, username));
    }

    private List<ElisaData> getElisadata(String sql, String query) {
        return new ArrayList<>(jdbcTemplate.query(sql, new Object[]{query}, (rs, rowNum) -> new ElisaData(rs.getString("elisa_id"),rs.getString("elisa_name"), rs.getString("description"), rs.getInt("priority"))
        ));
    }
}
