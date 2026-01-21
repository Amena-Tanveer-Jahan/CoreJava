package com.techouts.assessment3;

import java.util.Optional;

public class _12Optional {
    static void main() {
        Optional<String> val=Optional.of("Tanveer");
        Optional<Integer> map= val.map(String::length);
        System.out.println(map);
        Optional<Integer> flatmap = val.flatMap(n -> Optional.of(n.length()));
        System.out.println(flatmap);

    }
}
