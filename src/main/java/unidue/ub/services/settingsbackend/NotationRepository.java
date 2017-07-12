package unidue.ub.services.settingsbackend;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import unidue.ub.settings.fachref.Notation;

import java.util.List;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "notation", path = "notation")
public interface NotationRepository  extends PagingAndSortingRepository<Notation, String>{

    @Query("SELECT p FROM Notation p WHERE SUBSTRING(p.notation,1,3) BETWEEN :start AND :end")
    public List<Notation> findNotationsBetweenStartAndEnd(String start, String end);
}
