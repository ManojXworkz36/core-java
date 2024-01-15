package com.xworkz.customobject.customclasses;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Bus implements Comparable<Bus> {
    private Integer busId;
    private String busName;
    private String buscolor;

    @Override
    public int compareTo(Bus o) {
        return this.busId-o.busId;
    }
}
