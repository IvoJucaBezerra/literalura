package br.com.alura.literalura.repository;

import br.com.alura.literalura.model.Autor;
import br.com.alura.literalura.model.Idiomas;
import br.com.alura.literalura.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
    Optional<Livro> findByTituloContainingIgnoreCase(String nomeLivro);
    @Query("SELECT a FROM Autor a " +
            "WHERE a.anoDeNascimento <= :ano " +
            "AND (a.anoDeFalecimento IS NULL OR a.anoDeFalecimento >= :ano)")

    List<Autor> obterAutoresVivosEmAno(int ano);

    List<Livro> findByIdiomas(Idiomas idoma);
}
