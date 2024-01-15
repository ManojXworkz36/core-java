package com.xworkz.customobject.customclasses;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Mobile implements Comparable<Mobile> {
    private Integer mobileId;
    private String companyName;
    private String version;
    private String releaseDate;

    @Override
    public int compareTo(Mobile o) {
        return this.mobileId-o.mobileId;
    }
}
