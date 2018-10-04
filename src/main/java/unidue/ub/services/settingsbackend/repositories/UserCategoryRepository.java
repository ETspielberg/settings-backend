package unidue.ub.services.settingsbackend.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import unidue.ub.settings.fachref.UserCategory;

@RepositoryRestResource(collectionResourceRel = "userCategory", path = "userCategory")
public interface UserCategoryRepository extends PagingAndSortingRepository<UserCategory,String> {
}
