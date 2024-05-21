package map.AgendaEventos;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
    private final Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        this.eventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        System.out.println(this.eventoMap);
    }

    public void obterProximoEvento() {
        LocalDate dateNow = LocalDate.now();
        Optional<LocalDate> nextEvent = this.eventoMap.keySet().stream().filter(d -> d.isAfter(dateNow)).min(LocalDate::compareTo);

        nextEvent.ifPresent(localDate -> System.out.println("A data é: " + nextEvent.get() + ", e o evento é: " + this.eventoMap.get(localDate)));
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.parse("2024-04-01"), "teste", "teste");
        agendaEventos.adicionarEvento(LocalDate.parse("2024-05-01"), "teste2", "teste2");
        agendaEventos.adicionarEvento(LocalDate.parse("2024-05-23"), "teste3", "teste3");
        agendaEventos.adicionarEvento(LocalDate.parse("2024-05-21"), "teste4", "teste4");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
