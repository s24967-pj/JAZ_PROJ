package com.example.jazs24967nbp;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Component
@RestController
public class FirstController {

    private BankService bankService;


    public FirstController(BankService bankService) {
        this.bankService = bankService;
    }

    @Operation(summary = "Get a waluta by id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Znaleziono walute",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Bank.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Waluta not found",
                    content = @Content) })

    @GetMapping("/waluta/{id}")
    public ResponseEntity<Bank> getWalutabyId(@PathVariable int id) {
        Bank bank = bankService.getWalutaById(id);
        if (bank != null) {
            return ResponseEntity.ok(bank);
        } else {
            return ResponseEntity.notFound().build();
        }
    }



}
