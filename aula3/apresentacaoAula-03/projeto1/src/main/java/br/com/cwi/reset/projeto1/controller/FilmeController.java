package br.com.cwi.reset.projeto1.controller;

import br.com.cwi.reset.projeto1.domain.AvaliacaoForaDoPadraoException;
import br.com.cwi.reset.projeto1.domain.Diretor;
import br.com.cwi.reset.projeto1.domain.Filme;
import br.com.cwi.reset.projeto1.domain.Genero;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/filme")
public class FilmeController {

    private static List<Filme> filmes = new ArrayList<>();

    @PostMapping
    public ResponseEntity<Filme> cadastrarFilme(@RequestBody Filme filme) {
        Filme filmeExistente = buscarPorNome(filme.getNome());
        if (filmeExistente != null) {
            return ResponseEntity.badRequest().build();
        }
        filmes.add(filme);
        return ResponseEntity.ok(filme);
    }

    @GetMapping
    public List<Filme> consultarTodos() {
        return filmes;
    }

    @GetMapping("/{nome}")
    public Filme buscarFilmePeloNome(@PathVariable String nome) {
        return buscarPorNome(nome);
    }

    @DeleteMapping("/{nome}")
    public void deletarFilme(@PathVariable String nome) {
        Filme filme = buscarFilmePeloNome(nome);
        if (filme != null) {
            filmes.remove(filme);
        }
    }

    @PutMapping
    public Filme atualizarFilme(@RequestBody Filme filme) {
        Filme filmeExistente = buscarFilmePeloNome(filme.getNome());

        if (filmeExistente != null) {
            filmes.remove(filmeExistente);
            filmes.add(filme);
            return filme;
        }
        return null;
    }

    private Filme buscarPorNome(String nome) {
        for (Filme filme : filmes) {
            if (filme.getNome().equals(nome)) {
                return filme;
            }
        }
        return null;
    }
}
