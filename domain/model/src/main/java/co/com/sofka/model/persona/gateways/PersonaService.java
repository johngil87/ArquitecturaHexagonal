package co.com.sofka.model.persona.gateways;

import co.com.sofka.model.persona.Persona;
import reactor.core.publisher.Mono;

public interface PersonaService {
    Mono<Persona> getPersona(String id);
    Mono<Persona> savePersona(Persona persona);
}
