package br.com.agendamento.services;

import br.com.agendamento.dtos.ScheduleRequest;
import br.com.agendamento.dtos.ScheduleResponse;

import java.time.LocalDate;
import java.util.List;

public interface ScheduleService {
    ScheduleResponse createSchedule(ScheduleRequest scheduleRequest);
    List<String> getFilledTimesByDate(LocalDate date);
}
