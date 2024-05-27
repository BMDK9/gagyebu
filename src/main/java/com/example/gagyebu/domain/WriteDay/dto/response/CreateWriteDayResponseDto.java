package com.example.gagyebu.domain.WriteDay.dto.response;

import com.example.gagyebu.domain.WriteDay.entity.WriteDay;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CreateWriteDayResponseDto {

    private Integer month;
    private Integer date;

    @Builder
    private CreateWriteDayResponseDto(Integer month, Integer date) {

        this.month = month;
        this.date = date;
    }

    public static CreateWriteDayResponseDto of(WriteDay writeDay) {

        return CreateWriteDayResponseDto.builder()
                .month(writeDay.getMonth())
                .date(writeDay.getDate())
                .build();
    }
}
