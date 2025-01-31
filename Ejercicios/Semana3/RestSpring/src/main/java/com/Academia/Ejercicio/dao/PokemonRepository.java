package com.Academia.Ejercicio.dao;
import com.Academia.Ejercicio.entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PokemonRepository extends JpaRepository<Pokemon, Integer>
{


}
