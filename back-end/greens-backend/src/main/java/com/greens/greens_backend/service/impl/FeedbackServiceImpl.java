package com.greens.greens_backend.service.impl;

import com.greens.greens_backend.dto.FeedbackDto;
import com.greens.greens_backend.entity.Feedback;
import com.greens.greens_backend.mapper.FeedbackMapper;
import com.greens.greens_backend.repository.FeedbackRepository;
import com.greens.greens_backend.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    FeedbackRepository feedbackRepository;

    @Override
    public FeedbackDto addFeedback(Feedback feedback) {
        Feedback savedFeedback = feedbackRepository.save(feedback);
        return FeedbackMapper.mapFeedbackToFeedbackDto(savedFeedback);
    }
}
