package com.g4.fauxexchange.service;

import java.util.List;
import com.g4.fauxexchange.model.Result;
import com.g4.fauxexchange.model.AlgorithmResult;

public interface AlgorithmService {
    public abstract void showResult(Result result);
    public abstract void updateResult(double result);
	public abstract  List<Result> showResults();
	public abstract Result runResult(double result);
}