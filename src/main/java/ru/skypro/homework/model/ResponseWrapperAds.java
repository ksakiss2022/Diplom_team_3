package ru.skypro.homework.model;


import java.util.List;
import java.util.Objects;


public class ResponseWrapperAds {

    private int count;
    private List<Ads> results;



    public ResponseWrapperAds() {
    }

    public ResponseWrapperAds(int count, List<Ads> results) {
        this.count = count;
        this.results = results;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Ads> getResults() {
        return results;
    }

    public void setResults(List<Ads> results) {
        this.results = results;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResponseWrapperAds that = (ResponseWrapperAds) o;
        return count == that.count && results.equals(that.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, results);
    }
    @Override
    public String toString() {
        return "ResponseWrapperAds{" +
                "count=" + count +
                ", results=" + results +
                '}';
    }

}
