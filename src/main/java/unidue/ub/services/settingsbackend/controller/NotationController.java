package unidue.ub.services.settingsbackend.controller;

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

    private final NotationRepository notationRepository;

    @Autowired
    public NotationController(NotationRepository notationRepository) {
        this.notationRepository = notationRepository;
    }

    @GetMapping("notationsForGroup/{identifier}")
    public ResponseEntity<?> getNotationListForGroup(@PathVariable String identifier) {
        List<Notation> notations = new ArrayList<>(notationRepository.getNotationListForNotationgroup(identifier));
        return ResponseEntity.ok(notations);
    }
}
