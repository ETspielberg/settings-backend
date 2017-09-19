package unidue.ub.services.settingsbackend;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import unidue.ub.settings.fachref.ItemGroup;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "itemGroup", path = "itemGroup")
public interface ItemGroupRepository extends PagingAndSortingRepository<ItemGroup,String> {

}
