package com.luv2code.springboot.PokeDirectory.dao;

import com.luv2code.springboot.PokeDirectory.entity.Pokemon;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PokemonDAOJpaImpl implements PokemonDAO {

    // define field for entitymanager
    private EntityManager entityManager;


    // set up constructor injection
    @Autowired
    public PokemonDAOJpaImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }


    @Override
    public List<Pokemon> findAll() {

        // create a query
        TypedQuery<Pokemon> theQuery = entityManager.createQuery("from Pokemon", Pokemon.class);

        // execute query and get result list
        List<Pokemon> pokemons = theQuery.getResultList();

        // return the results
        return pokemons;
    }

    @Override
    public Pokemon findById(int theId) {

        // get pokemon
        Pokemon thePokemon = entityManager.find(Pokemon.class, theId);

        // return pokemon
        return thePokemon;
    }

    @Override
    public Pokemon save(Pokemon thePokemon) {

        // save pokemon
        Pokemon dbPokemon = entityManager.merge(thePokemon);

        // return the dbPokemon
        return dbPokemon;
    }

    @Override
    public void deleteById(int theId) {

        // find pokemon by id
        Pokemon thePokemon = entityManager.find(Pokemon.class, theId);

        // remove pokemon
        entityManager.remove(thePokemon);
    }
}











