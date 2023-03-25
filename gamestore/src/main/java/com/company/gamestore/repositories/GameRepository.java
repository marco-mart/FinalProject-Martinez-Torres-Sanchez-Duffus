package com.company.gamestore.repositories;

import com.company.gamestore.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game,Integer> {

    List<Game> findAllByStudio(String studio);

    List<Game> findAllByEsrb(String esrbRating);

    List<Game> findAllByTitle(String title);
}


