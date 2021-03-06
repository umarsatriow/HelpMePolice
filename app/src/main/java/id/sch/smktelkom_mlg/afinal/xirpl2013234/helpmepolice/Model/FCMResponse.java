package id.sch.smktelkom_mlg.afinal.xirpl2013234.helpmepolice.Model;

import java.util.List;

/**
 * Created by Umar on 26/4/2018.
 */


public class FCMResponse {
    public long multicast_id;
    public int success;
    public int failure;
    public int cononical_ids;
    public List<Result> results;

    public FCMResponse() {
    }

    public FCMResponse(long multicast_id, int success, int failure, int cononical_ids, List<Result> results) {
        this.multicast_id = multicast_id;
        this.success = success;
        this.failure = failure;
        this.cononical_ids = cononical_ids;
        this.results = results;
    }

    public long getMulticast_id() {
        return multicast_id;
    }

    public void setMulticast_id(long multicast_id) {
        this.multicast_id = multicast_id;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public int getFailure() {
        return failure;
    }

    public void setFailure(int failure) {
        this.failure = failure;
    }

    public int getCononical_ids() {
        return cononical_ids;
    }

    public void setCononical_ids(int cononical_ids) {
        this.cononical_ids = cononical_ids;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }
}
