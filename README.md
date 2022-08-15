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

## Data communication
Data communication is the central part of the project. This section outlines what components are used/needed for that and how they are set up.

### Components
They are used to establish the data communication between different components.

| Component | Function                                                                                                                                   |
|-----------|--------------------------------------------------------------------------------------------------------------------------------------------|
| Sensor    | The source of the data.                                                                                                                    |
| Connector | The connection between the sensor and the wire. <br/>Male connectors are always used for output, while female connectors are always input. |
| Wire      | The data transmitter.                                                                                                                      |
| ECU       | `Electronic Control Unit` The computer that manages the data it receives.                                                                  |

No matter the components that make up a system (i.e. `engine RPM sensor <-> ECU` or `ECU <-> ECU`), the order in which they are connected is always the same.
The same applies for what components are aware of each other.
> Note, that if an ECU is aware of another ECU it has access to all parameters of that ECU.  
>
> I.e. `TCM` (Transmission Control Unit) is aware of `ECU` (Engine Control Unit), it has access to the RPM of the engine as that is a parameter of the `ECU`.

The order is outlined below:

| Order | Component         | Aware |
|-------|-------------------|-------|
| 1     | ECU               | 2, 5  |
| 2     | Connector         | 1, 3  |
| 3     | Wire              | -     |
| 4     | Connector         | 3, 5  |
| 5     | Sensor, ECU, etc. | -     |

Looking at this structure we can see that a wire is always unaware of the components it connects, but always connects two connectors with each other
which are not aware of each other.

By organizing the communication between components like that we comply with [requirement 2](#2-follows-the-real-world).

## Code
The project strictly follows the OOP paradigm.



