/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indsol.CMMS.services;

import com.indsol.CMMS.entites.Artisan;
import java.util.List;

/**
 *
 * @author Sphongo
 */
public interface ArtisanService {
    List<Artisan> findAll();
    Artisan findById(Long id);
    Artisan save(Artisan artisan);
}
