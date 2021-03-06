package unidue.ub.services.settingsbackend;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import unidue.ub.settings.fachref.*;

/**
 * Created by Eike on 26.06.2017.
 */
@Configuration
public class SettingsBackendConfiguration extends RepositoryRestConfigurerAdapter {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(AnchorOrder.class,Collection.class,Notationgroup.class,Notation.class, UserCategory.class,UserGroup.class,ItemCategory.class,ItemGroup.class,EbsModel.class, Usersettings.class);
    }
}
