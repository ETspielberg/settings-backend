package unidue.ub.services.settingsbackend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import unidue.ub.services.settingsbackend.repositories.NotationRepository;
import unidue.ub.settings.fachref.Notation;

import java.util.ArrayList;
import java.util.List;

@Controller
public class NotationController {

    private final Logger log = LoggerFactory.getLogger(NotationController.class);

    private final NotationRepository notationRepository;

    @Autowired
    public NotationController(NotationRepository notationRepository) {
        this.notationRepository = notationRepository;
    }

    @GetMapping("/notation/forGroup/{identifier}")
    public ResponseEntity<?> getNotationListForGroup(@PathVariable String identifier) {
        log.info("querying notation group " + identifier);
        List<Notation> notations = new ArrayList<>(notationRepository.getNotationListForNotationgroup(identifier));
        return ResponseEntity.ok(notations);
    }
}
