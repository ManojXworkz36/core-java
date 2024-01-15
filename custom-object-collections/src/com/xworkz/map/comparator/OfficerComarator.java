package com.xworkz.map.comparator;

import com.xworkz.map.officer.Officer;

import java.util.Comparator;
import java.util.Map;

public class OfficerComarator implements Comparator<Map.Entry<Integer,Officer>> {
    @Override
    public int compare(Map.Entry<Integer,Officer>o1,Map.Entry<Integer,Officer>o2) {
        return o1.getValue().getOfficerAddress().compareTo(o2.getValue().getOfficerAddress());
    }
}
