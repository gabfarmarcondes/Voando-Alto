package br.dev.Back_end.dto;

import br.dev.Back_end.model.Address;
import br.dev.Back_end.model.Phone;

public record UserDTO(
        Long id,
        String username,
        String firstName,
        String lastName,
        String email,
        String password,
        String CPF,
        // String CPF
        Address address,
        Phone phone

)
{ }
