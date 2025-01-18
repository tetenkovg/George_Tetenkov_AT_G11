package objects;

import java.util.List;
import java.util.Objects;

public class SearchResponse {
    private String code;

    private List<UserData> data;

    public SearchResponse (){


    }
    public SearchResponse(String code, List<UserData> data) {
        this.code = code;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<UserData> getData() {
        return data;
    }

    public void setData(List<UserData> data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchResponse that = (SearchResponse) o;
        return Objects.equals(code, that.code) && Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, data);
    }

    @Override
    public String toString() {
        return "SearchResponse{" +
                "code='" + code + '\'' +
                ", data=" + data +
                '}';
    }
}
