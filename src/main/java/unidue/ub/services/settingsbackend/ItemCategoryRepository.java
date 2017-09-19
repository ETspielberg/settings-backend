package unidue.ub.services.settingsbackend;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import unidue.ub.settings.fachref.ItemCategory;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "itemCategory", path = "itemCategory")
public interface ItemCategoryRepository extends PagingAndSortingRepository<ItemCategory,String> {

}
