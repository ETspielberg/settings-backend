package unidue.ub.services.settingsbackend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import unidue.ub.services.settingsbackend.repositories.NotationRepository;
import unidue.ub.services.settingsbackend.repositories.NotationgroupRepository;
import unidue.ub.settings.fachref.Notation;
import unidue.ub.settings.fachref.Notationgroup;

import java.util.ArrayList;
import java.util.List;

@Controller
public class NotationController {

    private final Logger log = LoggerFactory.getLogger(NotationController.class);

    @Autowired
    private NotationRepository notationRepository;

    @Autowired
    private NotationgroupRepository notationgroupRepository;

    @GetMapping("/notation/forGroup/{identifier}")
    public ResponseEntity<?> getNotationListForGroup(@PathVariable String identifier) {
        log.info("querying notation group " + identifier);
        List<Notation> notations = new ArrayList<>(notationRepository.getNotationListForNotationgroup(identifier));
        return ResponseEntity.ok(notations);
    }

    @GetMapping("/notation/all")
    public ResponseEntity<?> getAllNotations() {
        log.info("retrieving all notrations" );
        List<Notation> notations = notationRepository.findAll();
        return ResponseEntity.ok(notations);
    }

    @GetMapping("/notationgroup/getElisaMail/{notationgroup}")
    public ResponseEntity<?> getElisaMailForNotationgroup(@PathVariable String notationgroup) {
        log.info("requesting elisa Mail for notationgroup " + notationgroup);
        Notationgroup ng = this.notationgroupRepository.getNotationgroupByNotationgroupName(notationgroup);
        return ResponseEntity.ok((ng.getElisaMail()));
    }
}
