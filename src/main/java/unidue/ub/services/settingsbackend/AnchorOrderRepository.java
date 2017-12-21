package unidue.ub.services.settingsbackend;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import unidue.ub.settings.fachref.AnchorOrder;

@RepositoryRestResource(collectionResourceRel = "anchororder", path = "anchororder")
public interface AnchorOrderRepository  extends PagingAndSortingRepository<AnchorOrder, Long> {

}
