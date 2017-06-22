package unidue.ub.services.settings;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Eike on 22.06.2017.
 */
@RepositoryRestResource(collectionResourceRel = "usersettings", path = "usersettings")
public interface UsersettingsRepository  extends PagingAndSortingRepository<Usersettings,Long> {
}
