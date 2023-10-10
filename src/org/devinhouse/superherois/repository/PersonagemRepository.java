package org.devinhouse.superherois.repository;


import org.devinhouse.superherois.exception.OpcaoInvalidaException;

import java.util.List;

public class PersonagemRepository {

    private List<PersonagemRepository> personagemList;

    public PersonagemRepository(List<PersonagemRepository> personagemList) {
        this.personagemList = personagemList;
    }

    public List<PersonagemRepository> getPersonagemList() {
        return personagemList;
    }

    public void setPersonagemList(List<PersonagemRepository> personagemList) {
        this.personagemList = personagemList;
    }

    @Override
    public String toString() {
        return "PersonagemRepository{" +
                "personagemList=" + personagemList +
                '}';
    }
    public void adicionarPersonagem(PersonagemRepository personagem) {
        try {
            personagemList.add(personagem);
            System.out.println("Personagem adicionado com sucesso.");
        } catch (OpcaoInvalidaException e) {
            System.err.println("Opção inválida: " + e.getMessage());
        }
    }
}
