package unidue.ub.services.settingsbackend;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import unidue.ub.settings.fachref.Collection;

@RepositoryRestResource(collectionResourceRel = "collection", path = "collection")
public interface CollectionRepository extends PagingAndSortingRepository<Collection, Long> {

}
