package com.example.gagyebu.domain.WriteDay.controller;

import com.example.gagyebu.domain.WriteDay.dto.GetWriteDayResponseDto;
import com.example.gagyebu.domain.WriteDay.dto.request.CreateWriteDayRequestDto;
import com.example.gagyebu.domain.WriteDay.dto.response.CreateWriteDayResponseDto;
import com.example.gagyebu.domain.WriteDay.service.WriteDayService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/writeday")
public class WriteDayController {

    private final WriteDayService writeDayService;

    @PostMapping
    public ResponseEntity<CreateWriteDayResponseDto> createWriteDay(
            @RequestBody CreateWriteDayRequestDto req) {

        CreateWriteDayResponseDto res = writeDayService.createWriteDay(req);

        return ResponseEntity.status(HttpStatus.CREATED).body(res);
    }

    @GetMapping
    public  ResponseEntity<GetWriteDayResponseDto> getWriteDay(@PathVariable Long writeDayId) {

        GetWriteDayResponseDto res = writeDayService.getWriteDay(writeDayId);
        return ResponseEntity.ok(res);
    }
}
