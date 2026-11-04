package com.fitness.activityservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fitness.activityservice.dto.ActivityRequest;
import com.fitness.activityservice.dto.ActivityResponse;
import com.fitness.activityservice.service.ActivityService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
@RequestMapping("/api/activities")
public class ActivityController {
	

	private ActivityService activityService;
	
	
	@PostMapping()
	public ResponseEntity<ActivityResponse> trackActivity(@RequestBody ActivityRequest request){
		return ResponseEntity.ok(activityService.trackActivity(request));
	}

}
