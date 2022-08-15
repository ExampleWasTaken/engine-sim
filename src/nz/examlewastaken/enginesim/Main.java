package nz.examlewastaken.enginesim;

import nz.examlewastaken.enginesim.environment.Environment;
import nz.examlewastaken.enginesim.simvars.SimVarInitializer;

public class Main {
    public static void main(String[] args) {
        boolean simActive = true;

        SimVarInitializer.init();

        Environment env = new Environment(20);

        long lastTime = System.nanoTime();
        while (simActive) {
            long currentTime = System.nanoTime();
            int deltaTime = (int) (currentTime - lastTime) / 1000000;
            lastTime = currentTime;


            env.update(deltaTime);
        }
    }
}
