package unidue.ub.services.settingsbackend;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import unidue.ub.settings.fachref.ProfilesPerUser;

import java.util.List;

/**
 * Created by Eike on 05.07.2017.
 */
@RepositoryRestResource(collectionResourceRel = "profilesperuser", path = "profilesperuser")
public interface ProfilesPerUserRepository extends PagingAndSortingRepository<ProfilesPerUser,Long> {

    public List<ProfilesPerUser> findByUsername(@Param("username") String username);

    public List<ProfilesPerUser> findByIdentifier(@Param("identifier") String identifier);
}