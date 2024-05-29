package com.example.gagyebu.domain.WriteDay.service;

import com.example.gagyebu.domain.WriteDay.dto.request.CreateWriteDayRequestDto;
import com.example.gagyebu.domain.WriteDay.dto.response.CreateWriteDayResponseDto;

public interface WriteDayService {

    CreateWriteDayResponseDto createWriteDay(CreateWriteDayRequestDto req);
}
