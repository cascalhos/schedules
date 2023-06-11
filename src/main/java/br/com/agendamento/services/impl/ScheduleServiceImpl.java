package br.com.agendamento.services.impl;

import br.com.agendamento.dtos.ScheduleRequest;
import br.com.agendamento.dtos.ScheduleResponse;
import br.com.agendamento.models.Schedule;
import br.com.agendamento.repositories.ScheduleRepository;
import br.com.agendamento.services.ScheduleService;
import io.swagger.v3.oas.annotations.servers.Server;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class ScheduleServiceImpl implements ScheduleService {
    @Autowired
    ModelMapper modelMapper;
    @Autowired
    ScheduleRepository scheduleRepository;

    @Override
    public ScheduleResponse createSchedule(ScheduleRequest scheduleRequest) {

        try {
            Schedule schedule = modelMapper.map(scheduleRequest, Schedule.class);
            log.info("Início: Salvar Agendamento com CPF {}", scheduleRequest.getCpf());
            Schedule scheduleSaved = scheduleRepository.save(schedule);
            log.info("Fim: Salvar Agendamento com CPF {}", scheduleRequest.getCpf());
            return modelMapper.map(scheduleSaved, ScheduleResponse.class);
        } catch (Exception ex) {
            log.error("Erro ao salvar agendamento {}", scheduleRequest);
            throw new RuntimeException("Erro ao salvar agendamento", ex);
        }
    }
}
