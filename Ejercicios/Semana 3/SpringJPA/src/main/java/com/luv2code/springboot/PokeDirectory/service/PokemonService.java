package com.luv2code.springboot.PokeDirectory.service;

import com.luv2code.springboot.PokeDirectory.entity.Pokemon;

import java.util.List;

public interface PokemonService {

    List<Pokemon> findAll();

    Pokemon findById(int theId);

    Pokemon save(Pokemon thePokemon);

    void deleteById(int theId);

}
