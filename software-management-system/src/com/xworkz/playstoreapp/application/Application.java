package com.xworkz.playstoreapp.application;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Application {
    private String appName;
    private int appId;
    private double sizeInMb;
    private String companyName;
    private String releaseDate;
    private String appType;
    private String appVersion;
}
