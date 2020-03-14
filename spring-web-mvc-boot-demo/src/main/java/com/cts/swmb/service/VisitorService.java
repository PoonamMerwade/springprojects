package com.cts.swmb.service;

import com.cts.swmb.exception.InvalidVisitorException;
import com.cts.swmb.model.Visitor;

public interface VisitorService {
	boolean isValid(Visitor visitor) throws InvalidVisitorException;
	Visitor computeAge(Visitor visitor);
}
