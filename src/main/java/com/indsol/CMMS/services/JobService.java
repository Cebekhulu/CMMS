/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indsol.CMMS.services;

import com.indsol.CMMS.entites.Job;
import java.util.List;

/**
 *
 * @author Sphongo
 */
public interface JobService {
    List<Job> findAll();
    Job findById(Long Id);
    Job save(Job job);
    Job delete(Job job);
}
