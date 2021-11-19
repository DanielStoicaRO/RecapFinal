package com.sda.recapFinalExercises.DependencyInversion;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
public class Computer {

    @Autowired
    private ComputerOperation operation;

    public void operation(ComputerOperation computerOperation) {
        computerOperation.operation();
    }


}
