package com.example.gagyebu.domain.WriteDay.repository;

import com.example.gagyebu.domain.WriteDay.entity.WriteDay;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WriteDayRepository extends JpaRepository<WriteDay, Long> {

    Optional<WriteDay> findByMonthAndDate(Integer month, Integer date);
}
