package com.corhuila.Backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.Backend.Entity.Pelicula;
import com.corhuila.Backend.IRepository.IPeliculaRepository;
import com.corhuila.Backend.IService.IPeliculaService;

@Service
public class PeliculaService implements IPeliculaService{
    @Autowired//Inyectar a repository el cual manejar por debajo los metodos de JPARepository
    private IPeliculaRepository iPeliculaRepository;

    @Override//Sobreescribir los metodos que ya estaban definidos en el IPeliculaService
    public List<Pelicula> findAll() {
        return iPeliculaRepository.findAll();
    }

    @Override
    public Pelicula findById(int id) {
        return iPeliculaRepository.findById(id).orElse(null);
    }

    @Override
    public Pelicula save(Pelicula pelicula) {
        return iPeliculaRepository.save(pelicula);
    }

    @Override
    public void update(Pelicula pelicula) {
        iPeliculaRepository.save(pelicula);
    }

    @Override
    public void deleteById(int id) {
        iPeliculaRepository.deleteById(id);
    }
}