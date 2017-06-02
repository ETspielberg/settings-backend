package unidue.ub.services.settings;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "sushiprovider", path = "sushiprovider")
public interface SushiproviderRepository  extends PagingAndSortingRepository<Sushiprovider, Long> {

}
