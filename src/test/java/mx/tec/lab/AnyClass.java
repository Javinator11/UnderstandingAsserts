package mx.tec.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class AnyClass {
	public void methodThatShouldThrowException() {
		throw new UnsupportedOperationException("Operation Is Not Supported");
	}
}

