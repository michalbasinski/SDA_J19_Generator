package pl.sda.generator;

import java.math.BigDecimal;

public class FibonacciGenerator implements Generator {

    private BigDecimal current = new BigDecimal(1);
    private BigDecimal prev = new BigDecimal(0);
    private boolean isFirst = true;

    @Override
    public BigDecimal next() {
        BigDecimal result;

        if (isFirst) {
            result = new BigDecimal(0);
            isFirst = false;
        } else {
            result = current.add(prev);
            prev = current;
            current = result;
        }

        return result;
    }

}
