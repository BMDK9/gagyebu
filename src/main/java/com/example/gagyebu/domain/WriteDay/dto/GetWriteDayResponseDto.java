package com.example.gagyebu.domain.WriteDay.dto;

import com.example.gagyebu.domain.WriteDay.entity.WriteDay;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class GetWriteDayResponseDto {

    private int month;
    private int date;

    @Builder
    private GetWriteDayResponseDto(int month, int date) {

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
