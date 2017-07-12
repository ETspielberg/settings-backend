package unidue.ub.services.settingsbackend;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import unidue.ub.settings.fachref.Notationgroup;

/**
 * Created by Eike on 07.07.2017.
 */
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "notationgroup", path = "notationgroup")
public interface NotationgroupRepository extends PagingAndSortingRepository<Notationgroup,String> {
}
