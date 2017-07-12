package unidue.ub.services.settingsbackend;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import unidue.ub.settings.fachref.AnchorOrder;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "anchororder", path = "anchororder")
public interface AnchorOrderRepository  extends PagingAndSortingRepository<AnchorOrder, Long> {

}
