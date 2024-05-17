package com.corhuila.Backend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corhuila.Backend.Entity.Pelicula;
import com.corhuila.Backend.Service.PeliculaService;

@RestController
@RequestMapping("/pelicula") // mapeamos todo lo que inicie con este end Points
@CrossOrigin//Indicarle que lo podemanejar local o remotamente en la nube
public class peliculaController {
    @Autowired//Inyectamos a service con los metodos
    private PeliculaService peliculaService;

    @GetMapping
    public List<Pelicula> findAll() {
        return peliculaService.findAll();
    }

    @GetMapping("/{id}")
    public Pelicula findById(@PathVariable int id) {
        return peliculaService.findById(id);
    }

    @PostMapping
    public Pelicula create(@RequestBody Pelicula pelicula) {
        return peliculaService.save(pelicula);
    }

    @PutMapping("/{id}")
    public Pelicula update(@PathVariable int id, @RequestBody Pelicula pelicula) {
        pelicula.setId(id); // Establecer el ID de la pelicula según el valor en la URL
        return peliculaService.save(pelicula);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        peliculaService.deleteById(id);
    }
}