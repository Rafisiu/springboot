package org.example.model;

import java.util.Map;
public class Page {
    private int size ;
    private int totalElements ;
    private int pageNumber ;

    private Map<String, Object> param;

    public int getEnd() {
        return pageNumber == 0 ? 0 :  Math.abs(((pageNumber - 1) * size + 1)-1);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(int totalElements) {
        this.totalElements = totalElements;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Map<String, Object> getParam() {
        return param;
    }

    public void setParam(Map<String, Object> param) {
        this.param = param;
    }


}