package com.luv2code.springboot.PokeDirectory.rest;

import com.luv2code.springboot.PokeDirectory.entity.Pokemon;
import com.luv2code.springboot.PokeDirectory.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PokemonRestController {

    private PokemonService pokemonService;

    @Autowired
    public PokemonRestController(PokemonService thePokemonService) {
        pokemonService = thePokemonService;
    }

    // expose "/pokemons" and return a list of employees
    @GetMapping("/pokemons")
    public List<Pokemon> findAll() {
        return pokemonService.findAll();
    }

    // add mapping for GET /employees/{employeeId}

    @GetMapping("/pokemons/{pokemonId}")
    public Pokemon getPokemon(@PathVariable int pokemonId) {

        Pokemon thePokemon = pokemonService.findById(pokemonId);

        if (thePokemon == null) {
            throw new RuntimeException("Pokemon id not found - " + pokemonId);
        }

        return thePokemon;
    }

    // add mapping for POST /employees - add new employee

    @PostMapping("/pokemons")
    public Pokemon addPokemon(@RequestBody Pokemon thePokemon) {

        // also just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update

        thePokemon.setId(0);

        Pokemon dbPokemon = pokemonService.save(thePokemon);

        return dbPokemon;
    }

    // add mapping for PUT /employees - update existing employee

    @PutMapping("/pokemons")
    public Pokemon updatePokemon(@RequestBody Pokemon thePokemon) {

        Pokemon dbPokemon = pokemonService.save(thePokemon);

        return dbPokemon;
    }

    // add mapping for DELETE /employees/{employeeId} - delete employee

    @DeleteMapping("/pokemons/{pokemonId}")
    public String deletePokemon(@PathVariable int PokemonId) {

        Pokemon tempPokemon = pokemonService.findById(PokemonId);

        // throw exception if null

        if (tempPokemon == null) {
            throw new RuntimeException("Pokemon id not found - " + PokemonId);
        }

        pokemonService.deleteById(PokemonId);

        return "Deleted employee id - " + PokemonId;
    }

}














