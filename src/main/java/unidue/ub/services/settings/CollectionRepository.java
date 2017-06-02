package unidue.ub.services.settings;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "collection", path = "collection")
public interface CollectionRepository extends PagingAndSortingRepository<Collection, Long> {

}
