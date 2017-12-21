package unidue.ub.services.settingsbackend;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import unidue.ub.settings.fachref.Sushiprovider;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "sushiprovider", path = "sushiprovider")
public interface SushiproviderRepository  extends PagingAndSortingRepository<Sushiprovider, String> {

    public ResponseEntity<Sushiprovider> save(@RequestBody List<Sushiprovider> sushiproviders);

}
