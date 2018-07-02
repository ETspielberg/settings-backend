package unidue.ub.services.settingsbackend;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import unidue.ub.settings.fachref.*;

/**
 * Created by Eike on 26.06.2017.
 */
@Configuration
public class SettingsBackendConfiguration extends RepositoryRestConfigurerAdapter {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Alertcontrol.class,AnchorOrder.class,Collection.class,Notationgroup.class,Notation.class,Stockcontrol.class,ProfilesPerUser.class,Usersettings.class,Sushiprovider.class,UserCategory.class,UserGroup.class,ItemCategory.class,ItemGroup.class,EbsModel.class);
    }
}
