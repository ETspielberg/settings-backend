package unidue.ub.services.settingsbackend;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import unidue.ub.settings.fachref.UserCategory;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "userCategory", path = "userCategory")
public interface UserCategoryRepository extends PagingAndSortingRepository<UserCategory,String> {
}
