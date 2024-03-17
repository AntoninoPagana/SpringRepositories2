package co.develhope.SpringRepositories2.controllers;

import co.develhope.SpringRepositories2.entities.ProgrammingLanguage;
import co.develhope.SpringRepositories2.services.PLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class PLController {
    @Autowired
    private PLService plService;

    @PostMapping("/addPL")
    public ResponseEntity<ProgrammingLanguage> addProgrammingLanguage(@RequestBody ProgrammingLanguage programmingLanguageToAdd) {
        ProgrammingLanguage programmingLanguageAdded = plService.addProgrammingLanguage(programmingLanguageToAdd);
        return ResponseEntity.ok().body(programmingLanguageAdded);
    }
}
