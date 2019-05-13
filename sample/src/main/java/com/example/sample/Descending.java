package com.example.sample;

import java.util.Comparator;

//    @LoadBalanced
//    @Bean
//    RestTemplate restTemplate() {
//        return new RestTemplate();
//    }
//}
class Descending implements Comparator<Dong> {
    @Override
    public int compare(Dong o1, Dong o2) {
        return o2.getMonths().compareTo(o1.getMonths());
    }
}
