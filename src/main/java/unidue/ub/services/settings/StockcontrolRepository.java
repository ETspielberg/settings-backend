package unidue.ub.services.settings;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Eike on 22.06.2017.
 */
@RepositoryRestResource(collectionResourceRel = "stockcontrol", path = "stockcontrol")
public interface StockcontrolRepository extends PagingAndSortingRepository<Stockcontrol, Long>{
}
