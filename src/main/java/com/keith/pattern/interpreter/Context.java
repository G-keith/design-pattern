package com.keith.pattern.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-19
 */
public class Context {

    private final Map<Variable,Integer> valueMap = new HashMap();

    public void addValue(Variable x, int y) {
        Integer yi = y;
        valueMap.put(x, yi);
    }

    public int lookupValue(Variable x) {
        return (int) (Integer) valueMap.get(x);
    }
}
