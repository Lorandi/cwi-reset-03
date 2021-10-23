package br.com.cwi.reset.projeto1.service;




import br.com.cwi.reset.projeto1.domain.Filme;
import br.com.cwi.reset.projeto1.domain.Pet;
import br.com.cwi.reset.projeto1.repository.PetRepository;

import java.util.List;

public class PetService {
    private PetRepository repository = new PetRepository();

    public List<Pet> listarTodos() {
        return repository.findAll();
    }

    public Pet buscarPorNome(String nome) {
        return repository.findByNome(nome);
    }

    public Pet salvar(Pet pet) {
         return repository.save(pet);
    }

    public Pet atualizar(Pet pet){
        Pet petJaCadastrado = buscarPorNome(pet.getNome());
        return repository.update(pet);
    }

    public void deletar(String nomePet)  {
        Pet pet = buscarPorNome(nomePet);
        repository.delete(pet);
    }

}
