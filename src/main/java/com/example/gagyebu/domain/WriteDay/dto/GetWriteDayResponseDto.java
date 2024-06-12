package com.example.gagyebu.domain.WriteDay.dto;

import com.example.gagyebu.domain.WriteDay.entity.WriteDay;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class GetWriteDayResponseDto {

    private Integer month;
    private Integer date;

    @Builder
    private GetWriteDayResponseDto(Integer month, Integer date) {

        this.month = month;
        this.date = date;
    }

    public static GetWriteDayResponseDto of (WriteDay writeDay) {

        return GetWriteDayResponseDto.builder()
                .month(writeDay.getMonth())
                .date(writeDay.getDate())
                .build();
    }
}
