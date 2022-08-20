package com.alpha.entity.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;

@MappedSuperclass
public abstract class BaseEntity implements Serializable{

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;
    
    //protected Long id;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date includeDate;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date changeDate;

    @PreUpdate
    public void preUpdate(){
    	Calendar brDate = Calendar.getInstance(TimeZone.getTimeZone("America/Sao_Paulo"),new Locale("pr", "BR"));
       this.setChangeDate(brDate.getTime());
    }
    
    @PrePersist
    public void prePersist(){
        if(this.getIncludeDate() == null){
        	Calendar brDate = Calendar.getInstance(TimeZone.getTimeZone("America/Sao_Paulo"),new Locale("pr", "BR"));
            this.setIncludeDate(brDate.getTime());
        }
    }
    
//    @Transient
//    public abstract Long getId();
//    
//    public void setId(Long id){
//        this.id = id;
//    }
    
    @Column(name = "dt_inserido", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    public Date getIncludeDate() {
        return this.includeDate; 
    }

    public void setIncludeDate(Date includeDate) {
        this.includeDate = includeDate;
    }

    @Column(name = "dt_atualizado")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getChangeDate() {
        return this.changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((id == null) ? 0 : id.hashCode());
//        return result;
//    }
    
}

