package com.fitness.activityservice.service;

import org.springframework.stereotype.Service;

import com.fitness.activityservice.dto.ActivityRequest;
import com.fitness.activityservice.dto.ActivityResponse;
import com.fitness.activityservice.model.Activity;
import com.fitness.activityservice.repo.ActivityRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ActivityService {
	
	private final ActivityRepository activityRepository;

	public ActivityResponse trackActivity(ActivityRequest request) {

		Activity activity = new Activity();

		activity.setUserId(request.getUserId());
		activity.setType(request.getType());
		activity.setDuration(request.getDuration());
		activity.setCaloriesBurned(request.getCaloriesBurned());
		activity.setStartTime(request.getStartTime());
		activity.setAdditionalMetrics(request.getAdditionalMetrics());

		Activity saveActivity = activityRepository.save(activity);
		return mapToResponse(saveActivity);
	}

	private ActivityResponse mapToResponse(Activity activity) {

		ActivityResponse response = new ActivityResponse();
		response.setId(activity.getId());
		response.setUserId(activity.getUserId());
		response.setType(activity.getType());
		response.setDuration(activity.getDuration());
		response.setCaloriesBurned(activity.getCaloriesBurned());
		response.setStartTime(activity.getStartTime());
		response.setAdditionalMetrics(activity.getAdditionalMetrics());
		response.setCreatedAt(activity.getCreatedAt());
		response.setUpdatedAt(activity.getUpdatedAt());

		return response;

	}

}
