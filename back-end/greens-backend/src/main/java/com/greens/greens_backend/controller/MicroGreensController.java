package com.greens.greens_backend.controller;

import com.greens.greens_backend.dto.MicroGreensDto;
import com.greens.greens_backend.entity.MicroGreens;
import com.greens.greens_backend.mapper.MicroGreensMapper;
import com.greens.greens_backend.service.MicroGreensService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/micro-greens")
@AllArgsConstructor
public class MicroGreensController {
    @Autowired
    private MicroGreensService microGreensService;

    @PostMapping("/add")
    @ResponseBody
    public MicroGreens add(@RequestBody MicroGreens f) {
        MicroGreensDto dto = microGreensService.addNewMicroGreen(f);
        return MicroGreensMapper.mapMicroGreensDtoToMicroGreens(dto);
    }

}
