package objects;

import java.util.Objects;

public class Search {
    private String user = "";
    private boolean strict;


    public Search(String user, boolean strict) {
        this.user = user;
        this.strict = strict;
    }

    public Search() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public boolean isStrict() {
        return strict;
    }

    public void setStrict(boolean strict) {
        this.strict = strict;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Search search = (Search) o;
        return strict == search.strict && Objects.equals(user, search.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, strict);
    }

    @Override
    public String toString() {
        return "Search{" +
                "user='" + user + '\'' +
                ", strict=" + strict +
                '}';
    }


}
