package br.com.agendamento.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
public class ScheduleResponse {
    private LocalDate date;
    private String time;
    private String pack;
}
