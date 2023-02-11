package com.alexchern.rent_da_house_resource_service.domain.dto;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class OwnerCreateDto {
    private String firstName;
    private String lastName;
    private String phoneNumber;
}