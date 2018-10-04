package unidue.ub.services.settingsbackend.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import unidue.ub.settings.fachref.EbsModel;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "ebsModel", path = "ebsModel")
public interface EbsModelRepository extends PagingAndSortingRepository<EbsModel, String> {

    @Query(value = "select * from ebs_model",nativeQuery = true)
    List<EbsModel> getAll();

}
