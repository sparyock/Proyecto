package com.corhuila.Backend.IService;

import java.util.List;

import com.corhuila.Backend.Entity.Pelicula;

public interface IPeliculaService {
    List<Pelicula> findAll(); // Devuelve una lista de peliculas
    Pelicula findById(int id); // Devuelve una pelicula por su id
    Pelicula save(Pelicula tarea); // Guarda un pelicula
    void update(Pelicula tarea); // Actualiza un pelicula
    void deleteById(int id); // Elimina un pelicula
}