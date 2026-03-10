package com.studying.jobtracker.dto;

import java.time.Instant;

public record StageTransitionDTO(String from, String to, Instant changedAt) {

}
