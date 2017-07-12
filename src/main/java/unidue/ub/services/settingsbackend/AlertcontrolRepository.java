package unidue.ub.services.settingsbackend;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import unidue.ub.settings.fachref.Alertcontrol;

import java.util.List;

/**
 * Created by Eike on 08.07.2017.
 */
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "alertcontrol", path = "alertcontrol")
public interface AlertcontrolRepository extends PagingAndSortingRepository<Alertcontrol,String>{

    public List<Alertcontrol> findByUsername(@Param("username") String username);
}
