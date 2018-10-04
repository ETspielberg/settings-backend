package unidue.ub.services.settingsbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import unidue.ub.services.settingsbackend.model.UserInformation;
import unidue.ub.services.settingsbackend.repositories.*;
import unidue.ub.settings.fachref.Alertcontrol;
import unidue.ub.settings.fachref.Stockcontrol;
import unidue.ub.settings.fachref.Sushiprovider;
import unidue.ub.settings.fachref.Usersettings;

import java.util.ArrayList;
import java.util.List;

@Controller
@RefreshScope
public class SettingsBackendController {

    @Autowired
    private UsersettingsRepository usersettingsRepository;

    @Autowired
    private SushiproviderRepository sushiproviderRepository;

    @Autowired
    private StockcontrolRepository stockcontrolRepository;

    @Autowired
    private AlertcontrolRepository alertcontrolRepository;


    @GetMapping("/userinformation")
    public ResponseEntity<List<UserInformation>> getUserInformation(@RequestParam("start") String start) {
        Iterable<Usersettings> allSettings = usersettingsRepository.findAll();
        List<UserInformation> information = new ArrayList<>();
        for (Usersettings settings : allSettings) {
            if (settings.getEmail() != null && settings.getUsername() != null) {
                if (settings.getEmail().toLowerCase().startsWith(start.toLowerCase()) && !settings.getUsername().isEmpty()) {
                    information.add(new UserInformation(settings.getUsername(),settings.getEmail()));
                }

            }
        }
        return ResponseEntity.ok(information);
    }

    /*
    avoid annoyance with HATEOAS spring implementation
     */
    @GetMapping("/stockcontrol/all")
    public ResponseEntity<List<Stockcontrol>> getAllStockcontrol() {
        List<Stockcontrol> stockcontrols = new ArrayList<>();
        stockcontrolRepository.findAll().forEach(stockcontrols::add);
        return ResponseEntity.ok(stockcontrols);
    }

    @GetMapping("/sushiprovider/all")
    public ResponseEntity<List<Sushiprovider>> getAllSushiprovider() {
        List<Sushiprovider> sushiproviders = new ArrayList<>();
        sushiproviderRepository.findAll().forEach(sushiproviders::add);
        return ResponseEntity.ok(sushiproviders);
    }

    @GetMapping("/alertcontrol/all")
    public ResponseEntity<List<Alertcontrol>> getAllAlertcontrol() {
        List<Alertcontrol> alertcontrols = new ArrayList<>();
        alertcontrolRepository.findAll().forEach(alertcontrols::add);
        return ResponseEntity.ok(alertcontrols);
    }

}
