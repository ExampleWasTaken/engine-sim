package nz.examlewastaken.enginesim.visitors.environment;

import nz.examlewastaken.enginesim.environment.Environment;

public interface Visitor {
    void visit(Environment environment);
}
