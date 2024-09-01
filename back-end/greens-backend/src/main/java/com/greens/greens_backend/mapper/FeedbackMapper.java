package com.greens.greens_backend.mapper;

import com.greens.greens_backend.dto.FeedbackDto;
import com.greens.greens_backend.entity.Feedback;

public class FeedbackMapper {

    public static FeedbackDto mapFeedbackToFeedbackDto(Feedback feedback) {
        return new FeedbackDto(
                feedback.getId(),
                feedback.getRating(),
                feedback.getComment()
        );
    }

    public static Feedback mapFeedbackDtoToFeedback(FeedbackDto feedbackDto) {
        return new Feedback(
                feedbackDto.getId(),
                feedbackDto.getRating(),
                feedbackDto.getComment()
        );
    }

}
