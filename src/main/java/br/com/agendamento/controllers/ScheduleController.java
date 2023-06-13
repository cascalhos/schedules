package br.com.agendamento.controllers;

import br.com.agendamento.dtos.ScheduleRequest;
import br.com.agendamento.dtos.ScheduleResponse;
import br.com.agendamento.services.ScheduleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("schedules")
public class ScheduleController {

    @Autowired
    private final ScheduleService scheduleService;
    @Operation(summary = "Create a Schedule")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "403", description = "You do not have permission to access this resource."),
            @ApiResponse(responseCode = "500", description = "An exception was generated"),
    })
    @PostMapping
    public ResponseEntity<ScheduleResponse> createSchedule(@RequestBody ScheduleRequest scheduleRequest){
        ScheduleResponse response = scheduleService.createSchedule(scheduleRequest);
        return ResponseEntity.ok(response);
    }

    @Operation(summary = "Get availables times by date")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "403", description = "You do not have permission to access this resource."),
            @ApiResponse(responseCode = "500", description = "An exception was generated"),
    })
    @GetMapping("filled-times/{date}")
    public ResponseEntity<List<String>> getFilledTimesByDate(@PathVariable LocalDate date){
        List<String> response = scheduleService.getFilledTimesByDate(date);
        return ResponseEntity.ok(response);
    }
}
