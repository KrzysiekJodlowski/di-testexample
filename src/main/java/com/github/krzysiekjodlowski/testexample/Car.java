package com.github.krzysiekjodlowski.testexample;

/**
 * Simple DI example:)
 *
 * @author Krzysztof Jodlowski
 */
class Car {

  Car(){}

  /**
   *  Test makeNoise() method but be careful! You cannot run the real engine
   *  but mock it and mock its method toString() method to return other sound:)
   */
  void makeNoise() {
    Engine engine = new GasolineEngine();
    // some invisible logic out here
    System.out.println(engine);
  }
}
