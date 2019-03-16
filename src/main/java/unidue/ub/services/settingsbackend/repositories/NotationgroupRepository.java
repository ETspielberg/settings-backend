package unidue.ub.services.settingsbackend.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import unidue.ub.settings.fachref.Notationgroup;

/**
 * Created by Eike on 07.07.2017.
 */
@RepositoryRestResource(collectionResourceRel = "notationgroup", path = "notationgroup")
public interface NotationgroupRepository extends PagingAndSortingRepository<Notationgroup,String> {

    @Query(value = "SELECT n.* FROM Notation n, Notationgroup ng WHERE  ng.notationgroup_name = :identifier AND SUBSTRING(n.notation,1,3) BETWEEN ng.notations_start AND ng.notations_end" , nativeQuery = true)
    Notationgroup getNotationgroupByNotationgroupName(String notationgroupName);
}
