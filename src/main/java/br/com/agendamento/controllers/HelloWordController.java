package br.com.agendamento.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello-word")
public class HelloWordController {

    @GetMapping
    @Operation(summary = "Hello Word")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Mostrado com sucesso"),
            @ApiResponse(responseCode = "403", description = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(responseCode = "500", description = "Foi gerada uma exceção"),
    })
    public ResponseEntity<String> findAllManga(){
        String helloWord = "Hello Word!!!";
        return ResponseEntity.ok(helloWord);
    }

}
