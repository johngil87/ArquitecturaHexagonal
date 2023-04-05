package co.com.sofka.repo;

import co.com.sofka.model.persona.Persona;
import co.com.sofka.model.persona.gateways.PersonaService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
public class LocalRepositoryAdapter implements PersonaService {

    private ArrayList<Persona> personas = new ArrayList<>();

    @Override
    public Mono<Persona> getPersona(String id) {
        return Mono.just((Persona) personas.stream().filter(per -> per.getId().equals(id)).collect(Collectors.toList()));
    }

    @Override
    public Mono<Persona> savePersona(Persona persona) {
        if(personas.stream().anyMatch(p -> p.getId().equals(persona.getId()))){
            return Mono.error(new IllegalArgumentException("esta persona ya existe"));
        }
        personas.add(persona);
        return Mono.just(persona);
    }
}
