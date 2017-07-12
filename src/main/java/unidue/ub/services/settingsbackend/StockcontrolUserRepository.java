package unidue.ub.services.settingsbackend;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import unidue.ub.settings.fachref.StockcontrolUser;

import java.util.List;

/**
 * Created by Eike on 05.07.2017.
 */
@RepositoryRestResource(collectionResourceRel = "stockcontrolUser", path = "stockcontrolUser")
public interface StockcontrolUserRepository extends PagingAndSortingRepository<StockcontrolUser,Long> {

    public List<StockcontrolUser> findByUsername(@Param("username") String username);

    public List<StockcontrolUser> findByIdentifier(@Param("identifier") String identifier);
}
