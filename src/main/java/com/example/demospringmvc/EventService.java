package com.example.demospringmvc;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EventService {

    public List<Event> getEvents() {
        Event event = Event.builder()
                .name("spring web mvc 스터디")
                .limitOfEnrollment(5)
                .startDateTime(LocalDateTime.of(2022, 1, 1, 0, 0, 0))
                .endDateTime(LocalDateTime.of(2022, 1, 1, 2, 0, 0))
                .build();

        Event event2 = Event.builder()
                .name("spring web mvc 스터디2")
                .limitOfEnrollment(5)
                .startDateTime(LocalDateTime.of(2022, 1, 2, 0, 0, 0))
                .endDateTime(LocalDateTime.of(2022, 1, 2, 2, 0, 0))
                .build();

        return List.of(event, event2);
    }
}
