package br.com.agendamento.services;

import br.com.agendamento.dtos.ScheduleRequest;
import br.com.agendamento.dtos.ScheduleResponse;

public interface ScheduleService {
    ScheduleResponse createSchedule(ScheduleRequest scheduleRequest);
}
