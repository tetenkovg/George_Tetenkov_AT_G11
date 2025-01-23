package tests.classwork.day22;

import java.util.Objects;

public class Result {
    public int status_id;

    public Result(int statusId) {
        this.status_id = statusId;
    }

    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return status_id == result.status_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(status_id);
    }

    @Override
    public String toString() {
        return "Result{" +
                "statusId=" + status_id +
                '}';
    }
}
