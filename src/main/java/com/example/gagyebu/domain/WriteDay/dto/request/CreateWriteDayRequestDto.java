package com.example.gagyebu.domain.WriteDay.dto.request;

import lombok.Getter;

@Getter
public class CreateWriteDayRequestDto {

    private Integer month;
    private Integer date;

    public void updateMonth (int month) {

        this.month = month;
    }

    public void updateDate (int date) {

        this.date = date;
    }
}
