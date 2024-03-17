package co.develhope.SpringRepositories2.repositories;

import co.develhope.SpringRepositories2.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages", collectionResourceDescription = @Description("Repository Linguaggi di programmazione"))
public interface RepositoryPL extends JpaRepository<ProgrammingLanguage, Long> {
}
