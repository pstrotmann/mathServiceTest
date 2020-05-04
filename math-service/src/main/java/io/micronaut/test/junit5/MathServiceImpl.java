package io.micronaut.test.junit5;

import javax.inject.Singleton;

@Singleton
public class MathServiceImpl implements MathService {
	@Override
    public Integer compute(Integer num) {
        return num * 4;
    }
}
