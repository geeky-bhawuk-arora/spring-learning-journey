package com.springlearning.jobportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.springlearning.jobportal.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import com.springlearning.jobportal.service.JobService;
import java.util.*;
import org.springframework.ui.Model;

@Controller
public class JobController {

    @Autowired
    private JobService service;

    @GetMapping({"/", "/home"})
    public String home() {
        return "home";
    }

    @GetMapping("addjob")
    public String addjob() {
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost) {
        service.addJob(jobPost);
        return "success";
    }

    @GetMapping("viewalljobs")
    public String viewJobs(Model m) {
        List<JobPost> jobs = service.viewAllJobs();
        m.addAttribute("jobPosts", jobs);
        return "viewalljobs";
    }
}
