package com.luv2code.springboot.PokeDirectory.dao;

import com.luv2code.springboot.PokeDirectory.entity.Pokemon;

import java.util.List;

public interface PokemonDAO {

    List<Pokemon> findAll();

    Pokemon findById(int theId);

    Pokemon save(Pokemon thePokemon);

    void deleteById(int theId);
}










