package com.xworkz.customobject.customclasses;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Laptop implements Comparable<Laptop> {
    private Integer laptopId;
    private String companyName;
    private String version;

    @Override
    public int compareTo(Laptop o) {
        return this.laptopId-o.laptopId;
    }
}
