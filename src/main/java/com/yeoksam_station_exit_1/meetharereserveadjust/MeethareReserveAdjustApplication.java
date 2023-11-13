package com.yeoksam_station_exit_1.meetharereserveadjust;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class MeethareReserveAdjustApplication {

  public static void main(String[] args) {
    SpringApplication.run(MeethareReserveAdjustApplication.class, args);
  }

}
