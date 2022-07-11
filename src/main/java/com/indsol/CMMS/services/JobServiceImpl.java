/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indsol.CMMS.services;

import com.google.common.collect.Lists;
import com.indsol.CMMS.entites.Job;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("JobService")
public class JobServiceImpl implements JobService {

    JobRepository jobRepo;
    @Override
    public List<Job> findAll() {
        return Lists.new ArrayList(jobRepo.findAll());
    }

    @Override
    public Job findById(Long id) {
        return jobRepo.findById(id).get();
    }

    @Override
    public Job save(Job job) {
        return jobRepo.save(job);
    }

    @Override
    public Job delete(Job job) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public setJobRepository(JobRepository jobRepo){
        this.jobRepo= jobRepo;
    }
    @Override
    @Transactional(readOnly = true)
    public Page<Job> findAllByPage(Pageable pageable){
        return jobRepo.findAll(pageable);
    }
}
