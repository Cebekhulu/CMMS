/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indsol.CMMS.entites;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Sphongo
 */
@Entity
public class Job implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private Equipment equipment;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
