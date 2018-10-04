package unidue.ub.services.settingsbackend.repositories;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.repository.PagingAndSortingRepository;
import unidue.ub.settings.fachref.Usersettings;


/**
 * Created by Eike on 22.06.2017.
 */
@RepositoryRestResource(collectionResourceRel = "usersettings", path = "usersettings")
public interface UsersettingsRepository  extends PagingAndSortingRepository<Usersettings,String> {

}
