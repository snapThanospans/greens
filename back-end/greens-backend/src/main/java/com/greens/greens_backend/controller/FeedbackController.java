package com.greens.greens_backend.controller;

import com.greens.greens_backend.dto.FeedbackDto;
import com.greens.greens_backend.entity.Feedback;
import com.greens.greens_backend.mapper.FeedbackMapper;
import com.greens.greens_backend.service.FeedbackService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "api/feedback")
//@AllArgsConstructor
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @PostMapping("/add")
    @ResponseBody
    public  Feedback add(@RequestBody Feedback feedback) {
        FeedbackDto feedbackDto = feedbackService.addFeedback(feedback);
        return FeedbackMapper.mapFeedbackDtoToFeedback(feedbackDto);
    }

}
