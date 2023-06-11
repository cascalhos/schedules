package br.com.agendamento.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Schedule {

    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    private String id;

    private String cpf;
    private LocalDate date;
    private String time;
    private String pack;
}
