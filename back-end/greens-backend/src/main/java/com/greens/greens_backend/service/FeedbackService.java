package com.greens.greens_backend.service;

import com.greens.greens_backend.dto.FeedbackDto;
import com.greens.greens_backend.entity.Feedback;
import org.springframework.stereotype.Service;


public interface FeedbackService {
    FeedbackDto addFeedback(Feedback feedback);

}
