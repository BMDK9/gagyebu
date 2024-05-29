package com.example.gagyebu.domain.WriteDay.service.impl;

import com.example.gagyebu.domain.WriteDay.dto.request.CreateWriteDayRequestDto;
import com.example.gagyebu.domain.WriteDay.dto.response.CreateWriteDayResponseDto;
import com.example.gagyebu.domain.WriteDay.entity.WriteDay;
import com.example.gagyebu.domain.WriteDay.repository.WriteDayRepository;
import com.example.gagyebu.domain.WriteDay.service.WriteDayService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WriteDayServiceImplVer1 implements WriteDayService {

    private final WriteDayRepository writeDayRepository;

    @Override
    public CreateWriteDayResponseDto createWriteDay(CreateWriteDayRequestDto req) {

        WriteDay writeDay = WriteDay.builder()
                .month(req.getMonth())
                .date(req.getDate())
                .build();

        writeDayRepository.save(writeDay);

        return CreateWriteDayResponseDto.of(writeDay);
    }
}
