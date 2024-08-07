package com.springlearning.jobportal.service;

import com.springlearning.jobportal.repo.JobRepo;
import com.springlearning.jobportal.model.JobPost;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost) {
        repo.addJob(jobPost);
    }

    public List<JobPost> viewAllJobs() {
        return repo.getAllJobs();
    }
}
