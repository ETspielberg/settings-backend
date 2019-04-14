package unidue.ub.services.settingsbackend.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import unidue.ub.settings.fachref.ElisaData;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "elisaData", path = "elisaData")
public interface ElisaDataRepository extends PagingAndSortingRepository<ElisaData, String> {

    @Query(value = "SELECT ed.* FROM elisa_data ed, notationgroup_elisa ne WHERE ed.elisa_mail = ne.elisa_id AND ne.notationgroup_id = :identifier" , nativeQuery = true)
    List<ElisaData> getForSubject(@Param("identifier") String identifier);

    @Query(value = "SELECT ed.* FROM elisa_data ed, libintel_elisa le WHERE ed.elisa_mail = le.elisa_id AND le.libintel_id = :identifier" , nativeQuery = true)
    List<ElisaData> getForLibintelUser(@Param("identifier") String identifier);
}
