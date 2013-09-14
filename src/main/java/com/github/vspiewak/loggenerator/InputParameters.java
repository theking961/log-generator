package com.github.vspiewak.loggenerator;

import com.beust.jcommander.Parameter;

public class InputParameters {

    @Parameter(names = {"-logs", "-n"}, description = "Number of logs to generate", required = true)
    public Long logs;

    @Parameter(names = {"-threads", "-t"}, description = "Number of threads to use")
    public Integer threads = 2;

    @Parameter(names = "--help", help = true)
    public boolean help;

}
