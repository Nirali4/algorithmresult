package com.g4.fauxexchange.service;

import java.util.List ;
import com.g4.fauxexchange.model.AlgorithmResult;

public interface AlgorithmService {
    public abstract void runResult(Algorithm algorithm);
    public abstract void updateResult();
}