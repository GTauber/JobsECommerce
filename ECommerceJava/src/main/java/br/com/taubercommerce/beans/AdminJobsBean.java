package br.com.taubercommerce.beans;

import br.com.taubercommerce.model.JobsModel;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

//Use of CDI:
@Named(value = "AdminJobsBean")
@RequestScoped
public class AdminJobsBean {

    private JobsModel job = new JobsModel();

    public void save() {
        System.out.println("Success" + job);
    }

    public JobsModel getJob() {
        return job;
    }

    public void setJob(JobsModel job) {
        this.job = job;
    }
}
