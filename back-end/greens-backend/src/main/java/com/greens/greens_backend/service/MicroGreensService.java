package com.greens.greens_backend.service;

import com.greens.greens_backend.dto.MicroGreensDto;
import com.greens.greens_backend.entity.MicroGreens;

public interface MicroGreensService {
    MicroGreensDto addNewMicroGreen(MicroGreens microGreens);
}
