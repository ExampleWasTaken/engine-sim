# *EngineSim* SimVars

SimVars are basically the wires between components. It's a key-value data type.  

### Storing SimVars
A SimVar is set with the [`SimVarStore.setSimVar()`](../src/nz/examlewastaken/enginesim/simvars/SimVarStore.java) method. It does not matter if the SimVar exists already. If it does 
the 
value is updated.

### Reading SimVars
To read a SimVar the [`SimVarStore.getSimVar()`](../src/nz/examlewastaken/enginesim/simvars/SimVarStore.java) method is used.

## SimVars
| Name             | Description                     | State |
|------------------|---------------------------------|-------|
| ENVIRONMENT_TEMP | The environment air temperature | -     |
