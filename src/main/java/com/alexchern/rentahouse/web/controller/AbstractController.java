package com.alexchern.rentahouse.web.controller;

import com.alexchern.rentahouse.web.facade.BaseFacade;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@AllArgsConstructor
public abstract class AbstractController<DTO> {

    private final BaseFacade<DTO> baseFacade;

    BaseFacade<DTO> getBaseFacade() {
        return this.baseFacade;
    }

    public List<DTO> getAll() {
        return baseFacade.getAll();
    }

    public DTO create(@RequestBody DTO dto) {
        return baseFacade.create(dto);
    }
}
