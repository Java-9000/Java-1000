package com.soft9000.M1000.A01000;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * A handy way to encapsulate those "nasty nulls," as well as
 * to manage calc-job-related operations & states. Notice how
 * using those optional underscores can help use quickly
 * determine any internal scopes?
 *
 * Far from a Java-wide practice, we could - for example - use:
 *
 * _ package ?
 * __ protected ?
 * ___ private ?
 *
 */
public class CalcJob {
    public final static String OPERATORS = "+-*/";
    ArrayList<String> _stack = new ArrayList<>();
    BigDecimal _btotal = null;

    /**
     * Set everything to the never-used state.
     */
    public void reset() {
        _btotal = null;
        _stack.clear();
    }

    /**
     * Get the effective BigDecimal value for this job. Will never be null.
     * @return An effective, non-null, numeric value for this job.
     */
    public BigDecimal getTotal() {
        if (_btotal == null) {
            return BigDecimal.valueOf(0);
        }
        return _btotal;
    }

    /**
     * Simply set the state / value for this job. Can be null!
     * @param value This job's state.
     */
    public void setTotal(BigDecimal value) {
        _btotal = value;
    }

    /**
     * Add a value or operation to the stack.
     *
     * @param aparam A number or operator to add to the RPN stack.
     * @return False if aparam is invalid, else true.
     */
    public boolean addParam(String aparam) {
        if (aparam == null || aparam.isEmpty()) return false;
        if (OPERATORS.contains(aparam)) {
            _stack.add(aparam);
            return true;
        }
        BigDecimal bd = Nexus.tryBigD(aparam);
        if (bd != null) {
            _stack.add(aparam);
            return true;
        }
        return false;
    }

    /**
     * Return this job's mutable stack of valid operations.
     *
     * @return The present stack. Is never null.
     */
    public ArrayList<String> getStack() {
        return this._stack;
    }
}
