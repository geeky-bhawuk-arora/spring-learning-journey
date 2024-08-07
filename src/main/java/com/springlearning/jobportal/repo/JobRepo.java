package com.springlearning.jobportal.repo;

import java.util.*;

import com.springlearning.jobportal.model.JobPost;
import org.springframework.stereotype.Repository;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
        new JobPost(1, "Software Engineer", "Develop and maintain software applications.", 3, "Java"),

        new JobPost(2, "Frontend Developer", "Design and implement user interfaces.", 2, "React"),

        new JobPost(3, "Data Scientist", "Analyze and interpret complex data.", 4, "Python"),

        new JobPost(4, "DevOps Engineer", "Manage and automate infrastructure.", 5, "Docker")));
    

    public List<JobPost> getAllJobs() {
        return jobs;
    }

    public void addJob(JobPost job) {
        jobs.add(job);
        System.out.println(jobs);
    }
}
