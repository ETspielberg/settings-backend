package unidue.ub.services.settingsbackend;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import unidue.ub.settings.fachref.Sushiprovider;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "sushiprovider", path = "sushiprovider")
public interface SushiproviderRepository  extends PagingAndSortingRepository<Sushiprovider, Long> {

}
