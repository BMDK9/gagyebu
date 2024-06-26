package com.example.gagyebu.domain.WriteDay.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class WriteDay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "writeDay")
    private Long id;

    @Column(nullable = false)
    private int month;

    @Column(nullable = false)
    private int date;

//    has many Income

//    has many Outcome

    @Builder
    private WriteDay(int month, int date) {

        this.month = month;
        this.date = date;
    }
}
