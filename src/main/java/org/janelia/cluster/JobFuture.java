package org.janelia.cluster;

import java.util.Collection;
import java.util.concurrent.CompletableFuture;

/**
 * A JobFuture represents the future completion of a single job or job array on the cluster. Either way,
 * the job id can be retrieved.
 * 
 * The future result will be a collection of all the final JobInfo objects for all the jobs in the job array.
 * 
 * @author <a href="mailto:rokickik@janelia.hhmi.org">Konrad Rokicki</a>
 */
public final class JobFuture extends CompletableFuture<Collection<JobInfo>> {

    private final Long jobId;

    JobFuture(Long jobId) {
        this.jobId = jobId;
    }
    
    /**
     * Returns the job id that has a future here.
     */
    public Long getJobId() {
        return jobId;
    }

}
