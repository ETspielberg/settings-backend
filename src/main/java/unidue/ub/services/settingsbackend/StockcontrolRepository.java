package unidue.ub.services.settingsbackend;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.repository.PagingAndSortingRepository;
import unidue.ub.settings.fachref.Stockcontrol;

import java.util.List;


/**
 * Created by Eike on 22.06.2017.
 */
@RepositoryRestResource(collectionResourceRel = "stockcontrol", path = "stockcontrol")
public interface StockcontrolRepository extends PagingAndSortingRepository<Stockcontrol, String>{

    @Query(value = "select s.* from Stockcontrol s,Stockcontrol_user su where s.identifier = su.identifier and su.username = :username",nativeQuery = true)
    public List<Stockcontrol> findByUsername(@Param("username") String username);
}