package space.dubovitsky.intruder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import space.dubovitsky.intruder.model.Declaration;
import space.dubovitsky.intruder.repositories.DeclarationRepo;

import java.util.List;

@Service
public class DeclarationService {

    private DeclarationRepo declarationRepo;

    @Autowired
    public DeclarationService(DeclarationRepo declarationRepo) {
        this.declarationRepo = declarationRepo;
    }

    public List<Declaration> getDeclarationList() {
        List<Declaration> all = declarationRepo.findAll();
        return all;
    }

    public void saveDeclaration(Declaration declaration) {
        declarationRepo.save(declaration);
    }

}
