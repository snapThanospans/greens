package com.greens.greens_backend.service.impl;

import com.greens.greens_backend.dto.MicroGreensDto;
import com.greens.greens_backend.entity.MicroGreens;
import com.greens.greens_backend.mapper.MicroGreensMapper;
import com.greens.greens_backend.repository.MicroGreensRepository;
import com.greens.greens_backend.service.MicroGreensService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MicroGreensServiceImpl implements MicroGreensService{
    @Autowired
    private MicroGreensRepository microGreensRepository;

    public MicroGreensDto addNewMicroGreen(MicroGreens microGreens) {
        MicroGreens savedItem = microGreensRepository.save(microGreens);
        return MicroGreensMapper.mapMicroGreensToMicroGreensDto(savedItem);
    }

}
