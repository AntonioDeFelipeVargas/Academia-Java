package com.Academia.Ejercicio.entity;
import jakarta.persistence.*;
    @Entity
    @Table(name="pokemon")//nombre de la tabla en BD
    public class Pokemon {

        // define fields
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="id")
        private int id;

        @Column(name="nombre")
        private String pokemonName;

        @Column(name="tipo")
        private String typeName;

        @Column(name="generacion")
        private String generation;


        // define constructors
        public Pokemon() {

        }

        public Pokemon(int id, String pokemonName, String typeName, String generation) {
            this.id = id;
            this.pokemonName = pokemonName;
            this.typeName = typeName;
            this.generation = generation;
        }
        // define getter/setter

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getPokemonName() {
            return pokemonName;
        }

        public void setPokemonName(String pokemonName) {
            this.pokemonName = pokemonName;
        }

        public String getTypeName() {
            return typeName;
        }

        public void setTypeName(String typeName) {
            this.typeName = typeName;
        }

        public String getGeneration() {
            return generation;
        }

        public void setGeneration(String generation) {
            this.generation = generation;
        }


        // define toString
        @Override
        public String toString() {
            return "Pokemon{" +
                    "id=" + id +
                    ", pokemonName='" + pokemonName + '\'' +
                    ", typeName='" + typeName + '\'' +
                    ", generation='" + generation + '\'' +
                    '}';
        }
    }

