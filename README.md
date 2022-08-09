# _EngineSim_
This is a personal project of mine. The goal is to simulate a car engine. Despite the name being _EngineSim_, the focus is more on the electronics (sensors, ECUs and their communication) than 
the physics of the actual engine. 

# Design
## Definitions
- **System:** Does not refer to a software system but to a system inside the car, i.e. TC.
- **Component:** The part of the software that relates to actual parts of the car, i.g. Crank position sensor.
- **Environment:** The environment the engine runs in. It has properties such as air temperature, etc.
- **Software:** The thing we're building.

## Requirements
In order to achieve maximum reusability and maintainability a few requirements need to be met. They are outlined below.

### 1. Runs outside the simulator
What this means is that the different parts of the simulation should run independent of the other. I.e. the environment should work independent of any other part of the software as it is its 
own system. 

### 2. Follows the real world
As all components live on their own, they are not necessarily aware of each other. I.e. a sensor does not know about the ECU that is reading its values.

### 3. Consistent state
Thanks to the design explained [here](#2-follows-the-real-world) a dependency tree can be generated. This tree needs to be taken into account when components are updated. E.g. before the engine 
control unit can use the value of the crank position sensor, the sensor needs to be updated.

An important thing to consider is that all data sent over the communication protocol must be immutable as it cannot be modified after it has been generated.

## Code
The project strictly follows the OOP paradigm.



