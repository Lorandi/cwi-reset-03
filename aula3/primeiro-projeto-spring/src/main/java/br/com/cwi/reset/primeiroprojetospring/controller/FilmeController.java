package br.com.cwi.reset.primeiroprojetospring.controller;


import br.com.cwi.reset.primeiroprojetospring.domain.Filme;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/filme")
public class FilmeController {
    private static List<Filme> filmes = new ArrayList<>();

    private Filme buscarFilmetPeloNome(String nome) {
        for (Filme filme : filmes) {
            if (filme.getNome().equals(nome)) {
                return filme;
            }
        }
        return null;
    }

    @PostMapping
    public ResponseEntity<Filme> cadastrarFilme(@RequestBody Filme filme) {
        for (Filme filmeCadastrado: filmes ){
            if(filmeCadastrado.getNome().equals(filme.getNome())){
                return ResponseEntity.badRequest().build();
            }
        }
        filmes.add(filme);
        return ResponseEntity.ok(filme);
    }

    @GetMapping()
    public List<Filme> listarFilmes(){
        return filmes;
    }


    @GetMapping("/{nome}")
    public ResponseEntity<Filme> consultaFilme(@PathVariable String nome) {
        Filme filme = buscarFilmetPeloNome(nome);
        if (filme == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(filme);
    }

    @DeleteMapping("/{nome}")
    public void deletarFilme(@PathVariable String nome) {
        Filme filme = buscarFilmetPeloNome(nome);
        if (filme != null) {
            filmes.remove(filme);
        }
    }

    @PutMapping
    public Filme atualizarFilme(@RequestBody Filme filme) {
        Filme filmeCadastrado = buscarFilmetPeloNome(filme.getNome());

        if (filmeCadastrado != null) {
            filmes.remove(filmeCadastrado);
            filmes.add(filme);
            return filme;
        }
        return null;
    }

}





//    Diretor diretor1 = new Diretor("Steven Spilberg", LocalDate.now(), 45, Genero.MASCULINO);
//    Diretor diretor2 = new Diretor("Pedro Almodovar", LocalDate.now(), 33, Genero.MASCULINO);
//    Ator ator1 = new Ator("Tiririca", LocalDate.now(), 12, Genero.MASCULINO);
//    Ator ator2 = new Ator("Dona Florinca", LocalDate.now(), 17, Genero.FEMININO);
//
//        try {
//                Filme filme1 = new Filme("Tubarão",
//                "Banhistas aprontam muitas confusões com peixe nervoso",
//                90,
//                1981,
//                9.0, diretor1);
//                Filme filme2 = new Filme("Tudo sobre minha mãe",
//                "Problemas com a mami",
//                120,
//                2003,
//                5.0, diretor2);
//
//                } catch (exceptions.AvaliacaoForaDoPadraoException e) {
//                System.out.println(e.getMessage());
//                }








