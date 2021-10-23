package br.com.cwi.reset.projeto1.controller;

import br.com.cwi.reset.projeto1.domain.Filme;
import br.com.cwi.reset.projeto1.domain.Pet;
import br.com.cwi.reset.projeto1.service.PetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pet")
public class PetController {

    private PetService petService = new PetService();

    @GetMapping
    public List<Pet> getPet() {
        return petService.listarTodos();
    }


    @GetMapping("/{nome}")
    public ResponseEntity<Pet> getById(@PathVariable String nome) {
        if (nome == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(petService.buscarPorNome(nome));
    }


    @PostMapping
    public Pet cadastrarPet(@RequestBody Pet pet) {
        Pet petSalvo = petService.salvar(pet);
        return petSalvo;
    }

    @PutMapping
    public void atualizarPet(@RequestBody Pet pet) {
        petService.atualizar(pet);
    }

    @DeleteMapping("/{nome}")
    public void deletarPet(@PathVariable String nome) {
        petService.deletar(nome);
    }


}
