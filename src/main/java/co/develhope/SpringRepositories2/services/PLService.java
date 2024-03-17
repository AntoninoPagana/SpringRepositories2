package co.develhope.SpringRepositories2.services;

import co.develhope.SpringRepositories2.entities.ProgrammingLanguage;
import co.develhope.SpringRepositories2.repositories.RepositoryPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PLService {
    @Autowired
    private RepositoryPL repositoryPL;

    public ProgrammingLanguage addProgrammingLanguage(ProgrammingLanguage programmingLanguageToAdd) {
        ProgrammingLanguage programmingLanguageAdded = repositoryPL.save(programmingLanguageToAdd);
        return programmingLanguageAdded;
    }
}
