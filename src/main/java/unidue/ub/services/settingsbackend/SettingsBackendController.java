package unidue.ub.services.settingsbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import unidue.ub.services.settingsbackend.model.UserInformation;
import unidue.ub.settings.fachref.Usersettings;

import java.util.ArrayList;
import java.util.List;

@Controller
@RefreshScope
public class SettingsBackendController {

    @Autowired
    private UsersettingsRepository usersettingsRepository;

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
}
