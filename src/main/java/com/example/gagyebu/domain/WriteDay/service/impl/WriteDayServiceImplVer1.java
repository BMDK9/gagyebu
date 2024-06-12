package com.example.gagyebu.domain.WriteDay.service.impl;

import com.example.gagyebu.domain.WriteDay.dto.GetWriteDayResponseDto;
import com.example.gagyebu.domain.WriteDay.dto.request.CreateWriteDayRequestDto;
import com.example.gagyebu.domain.WriteDay.dto.response.CreateWriteDayResponseDto;
import com.example.gagyebu.domain.WriteDay.entity.WriteDay;
import com.example.gagyebu.domain.WriteDay.repository.WriteDayRepository;
import com.example.gagyebu.domain.WriteDay.service.WriteDayService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
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

        log.info("id = {}, month = {}, date = {}",
                writeDay.getId(), writeDay.getMonth(), writeDay.getDate());

        return CreateWriteDayResponseDto.of(writeDay);
    }

    @Override
    public GetWriteDayResponseDto getWriteDay(Long writeDayId) {

        WriteDay writeDay = writeDayRepository.findById(writeDayId).orElseThrow(
                () -> new IllegalArgumentException("해당 날짜 가계부 없음"));

        log.info("id = {}, month = {}, date = {}",
                writeDay.getId(), writeDay.getMonth(), writeDay.getDate());

        return  GetWriteDayResponseDto.of(writeDay);
    }
}
